#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <tcp.h>
#include "profile.h"
#include <signal.h>
#include <yktclt.h>
#include <pubfunc.h>
#include <bank_gateway.h>


CONFIG_PARA g_para;

typedef struct
{
	char campus_no[12+1];	//1   ѧУ��� aaaaaaaaaaaaaaaaaaaaaa
	char txcode[5+1]; //2        ���״���      
	char userno[12+1]; //3        �ͻ���ţ�ÿ��ת�ʵ�Ψһ��ʶ�������У���ѧ�ţ� 
	char usernoalias[18+1];//4  ����֤��
	char acctperi[5+1];//5 ����
	char acctno[20+1];//6	�����˺Ż򿨺�
	char due_amount[10+1];//7	���׽���ʽ��180.00��
	char pay_amount[10+1]; //8�ɹ�������� 
	char custname[20+1]; //9/////�ͻ���
	char site[5+1]; //10��������	111111111xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	char teller[5+1];	//11	���׹�Ա 1111111111xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	char time[14+1];//12	����ʱ��,���ڣ�ʱ��
	char comporder[8+1];	//13��˾����ˮ  xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	char bankorder[8+1];	//14���з���ˮ
	char comp_o_order[8+1];//15��˾��ԭ������ˮ  
	char bank_o_order[8+1];//16���з�ԭ������ˮ  	
	char note[50+1];	//17������Ϣ  
	char result[3+1];//18	���׳ɹ���ʧ��	00���ɹ�	01��ʧ��   
	char retmessage[50+1];	//19������Ϣ 
}Message;

static void str2struct(char *buf,Message *j)
{
	int len,i;
	char *p,*q,*str[20];
	len=strlen(buf);
	//q=strstr(buf,"&")+1;
	q=buf+1;
	for(i=1;q<buf+len-1;i++)
	{
		p=strstr(q,"|");
		*p++=0;
		str[i]=p;
		q=p;
	}
	strcpy(j->campus_no,str[1]);	//1   ѧУ��� aaaaaaaaaaaaaaaaaaaaaa
	strcpy(j->txcode,str[2]); //2        ���״���      
	strcpy(j->userno,str[3]); //3        �ͻ���ţ�ÿ��ת�ʵ�Ψһ��ʶ�������У���ѧ�ţ� 
	strcpy(j->usernoalias,str[4]);//4  ����֤��
	strcpy(j->acctperi,str[5]);//5 ����
	strcpy(j->acctno,str[6]);//6	�����˺Ż򿨺�
	strcpy(j->due_amount,str[7]);//7	���׽���ʽ��180.00��
	strcpy(j->pay_amount,str[8]); //8�ɹ�������� 
	strcpy(j->custname,str[9]); //9/////�ͻ���
	strcpy(j->site,str[10]); //10��������	111111111xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	strcpy(j->teller,str[11]);	//11	���׹�Ա 1111111111xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	strcpy(j->time,str[12]);//12	����ʱ��,���ڣ�ʱ��
	strcpy(j->comporder,str[13]);	//13��˾����ˮ  xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	strcpy(j->bankorder,str[14]);	//14���з���ˮ
	strcpy(j->comp_o_order,str[15]);//15��˾��ԭ������ˮ  
	strcpy(j->bank_o_order,str[16]);//16���з�ԭ������ˮ  	
	strcpy(j->note,str[17]);	//17������Ϣ  
	strcpy(j->result,str[18]);//18	���׳ɹ���ʧ��	00���ɹ�	01��ʧ��   
	strcpy(j->retmessage,str[19]);	//19������Ϣ 
}

static void struct2str(Message *j,char *buf)  //ƴװ
{
	sprintf(buf,"&|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|#",		
		j->campus_no, //1
		j->txcode, //2
		j->userno, //3
		j->usernoalias, //4
		j->acctperi, //5
		j->acctno, //6
		j->due_amount, //7
		j->pay_amount, //8
		j->custname, //9
		j->site, //10
		j->teller, //11
		j->time, //12
		j->comporder, //13
		j->bankorder, //14
		j->comp_o_order, //15
		j->bank_o_order, //16
		j->note, //17
		j->result, //18
		j->retmessage); //19

}

static void print_msg(Message *Msg)
{
	printf("ѧУ��� campus_no:    [%s]\n", Msg->campus_no);
	printf("���״��� txcode:       [%s]\n", Msg->txcode);
	printf("�ͻ���� userno:       [%s]\n", Msg->userno);
	printf("�ͻ��ӱ�� usernoalias:[%s]\n", Msg->usernoalias);
	printf("���� acctperi:         [%s]\n", Msg->acctperi);
	printf("�˺� acctno:           [%s]\n", Msg->acctno);
	printf("���׽�� due_amount:   [%s]\n", Msg->due_amount);
	printf("��� pay_amount:       [%s]\n", Msg->pay_amount);
	printf("�ͻ����� custname:     [%s]\n", Msg->custname);
	printf("�������� site:         [%s]\n", Msg->site);
	printf("���׹�Ա teller:       [%s]\n", Msg->teller);
	printf("�������ڣ�ʱ�� time:   [%s]\n", Msg->time);
	printf("��˾����ˮ comporder:  [%s]\n", Msg->comporder);
	printf("���з���ˮ bankorder:  [%s]\n", Msg->bankorder);
	printf("��˾��ԭ������ˮ comp_o_order: [%s]\n", Msg->comp_o_order);
	printf("���з�ԭ������ˮ bank_o_order: [%s]\n", Msg->bank_o_order);
	printf("������Ϣ note:         [%s]\n", Msg->note);
	printf("��Ӧ�� result:         [%s]\n", Msg->result);
	printf("������Ϣ retmessage:   [%s]\n", Msg->retmessage);
	return;
}

static void print_recv_msg(Message *Msg)
{
	printf("===================== ���з��ر��Ŀ�ʼ =====================\n");
	print_msg(Msg);
	printf("===================== ���з��ر��Ľ��� ======================\n");
	return; 
}

static void print_send_msg(Message *Msg)
{
	printf("\n==================== ���ͱ��Ŀ�ʼ =====================\n");
	print_msg(Msg);
	printf("====================== ���ͱ��Ľ��� ======================\n");
	return; 
}

static bool ReadIni(char *inifile)
{
   TIniFile tf;
  
   char szBuf[256];
  
   memset(&g_para,0,sizeof(g_para));
   printf("Begin to read ini-file:%s...\n",inifile);
   if (!tf.Open(inifile))
   {
      sprintf(szBuf,"���ܴ������ļ�<%s>\n",inifile);
      return false;
   }
   tf.ReadString("DRTP","drtp_ip","127.0.0.1",g_para.drtp_ip,sizeof(g_para.drtp_ip)-1);
   g_para.drtp_port = tf.ReadInt("DRTP","drtp_port",4000);
   g_para.main_funcno = tf.ReadInt("DRTP","main_func",9000);
   g_para.drtp_timeout = tf.ReadInt("DRTP","time_out",5000);
   
   g_para.bank_lisnport = tf.ReadInt("BANK","listen_port",4001);
   g_para.bank_timeout = tf.ReadInt("BANK","time_out",3000);
    g_para.term_id= tf.ReadInt("BANK","term_id",3000);
   tf.Close();
   return true;   
}


static void doSetdata(char* type,KS_YKT_Clt &ykt_clt,Message &msg)
{
	//printf("\nuserno[%s] acctno[%s]\n",msg.userno,msg.acctno);
	//int ret=0;
	//char errmsg[256]="";
	//writelog(LOG_INFO,"�� userno[%s],acctno[%s]\n", msg.userno, msg.acctno);
	//ykt_clt.SetStringFieldByName("sstatus0", "A");		
	ykt_clt.SetStringFieldByName("sstatus0", type);
	ykt_clt.SetStringFieldByName("scust_auth2", msg.userno);		
    ykt_clt.SetStringFieldByName("sname", msg.usernoalias);		
    ykt_clt.SetStringFieldByName("scard1" ,msg.acctno);		
    ykt_clt.SetStringFieldByName("scust_no", msg.bankorder);	
    //ykt_clt.SetStringFieldByName("sbank_code", BANKCODE);	
	ykt_clt.SetStringFieldByName("sbank_code","00");  //���б��	
 	ykt_clt.SetIntFieldByName("lwithdraw_flag", g_para.term_id);
	//ykt_clt.SendRequest(841602, 2000);
}
static void doSetErr(KS_YKT_Clt &ykt_clt,Message &msg,char errmsg[])
{
	ykt_clt.GetStringFieldByName("vsmess",errmsg,sizeof errmsg);       
	trim(errmsg);
	des2src(msg.result,"01");
	des2src(msg.retmessage,errmsg);
}

static int doProcess(char* type,KS_YKT_Clt &ykt_clt,Message &msg)
{
	int ret=0;
	char errmsg[256]="";
	//doSetdata("A",ykt_clt,msg);
	doSetdata(type,ykt_clt,msg);
	if(!ykt_clt.SendRequest(841602, g_para.drtp_timeout))
	{
		doSetErr(ykt_clt,msg,errmsg);
		printf("���̨��������ʧ��[%s]\n",errmsg); 
		writelog(LOG_ERR,"���̨��������ʧ��[%s]\n",errmsg);
		return 	-1;
	}
	if((ret = ykt_clt.GetReturnCode()))
	{
		doSetErr(ykt_clt,msg,errmsg);
		printf("��̨����ִ��ʧ��,retcode[%d],msg[%s]\n",ret,errmsg); 
		writelog(LOG_ERR,"��̨����ִ��ʧ��,retcode[%d],msg[%s]\n",ret,errmsg);
		return  ret;
	}
	des2src(msg.result,"00");
	if(strcmp(type,"A")==0)
		des2src(msg.retmessage,"ǩԼ�ɹ�");
	else if(strcmp(type,"D")==0)
		des2src(msg.retmessage,"��Լ�ɹ�");
	return 0;

}


static int doBind(KS_YKT_Clt &ykt_clt,Message &msg)
{		
	return doProcess("A",ykt_clt,msg);
}

// int doUnbind(KS_YKT_Clt &ykt_clt,INFO_BIND &info_bind,Message &recv_msg)

static int doUnbind(KS_YKT_Clt &ykt_clt,Message &msg)
{
	return doProcess("D",ykt_clt,msg);
}


int doResponse(char *recv_buf,int recv_len,char *send_buf,int &send_len)
{
	KS_YKT_Clt ykt_clt;
	int retcode = 0;
	Message recv_msg;
	str2struct(recv_buf,&recv_msg);
	print_recv_msg(&recv_msg);
	if(strcmp(recv_msg.txcode,"10000")==0)  //10000������ί�й�ϵ
	{
		retcode = doBind(ykt_clt,recv_msg);

	}
	else if(strcmp(recv_msg.txcode,"10001")==0) //  10001������ί�й�ϵ
	{
		retcode = doUnbind(ykt_clt,recv_msg);
	}
	else
	{
		return E_TRANS_NONSUPPORT;
	}
	struct2str(&recv_msg,send_buf);
	send_len=strlen(send_buf);
	print_send_msg(&recv_msg);  
	return 0;
  }
    
int doProcess(CTcpSocket &acpsocket)
{
	
	int ret = 0;
    int send_len = 0;
    char recv_buf[4096] = "";
    char send_buf[4096] = "";
	acpsocket.Recv(recv_buf, sizeof(recv_buf), g_para.bank_timeout);
	ret=strlen(recv_buf);
    writelog(LOG_INFO,"len[%d],recv_buf[%s]\n",ret,recv_buf);
    ret = doResponse(recv_buf,strlen(recv_buf),send_buf,send_len);
    if(ret)
    {
        if(ret>0)
            return ret;
    }    
    
    send_buf[send_len]=0;
    writelog(LOG_INFO,"len[%d],send_buf[%s]\n",send_len,send_buf);
	ret = acpsocket.Send(send_buf,send_len);
	if(ret != send_len)
    {
        writelog(LOG_ERR,"�������ݴ���\n");
        return -1;
    }
    return 0;
}
int main()
{
	bool flag = false;
	int childpid = 0;
	char *inifile = "transconfig.ini";
	CTcpSocket tcpsocket ;
	CTcpSocket sockettmp ;
	
	openlog("yktbank_gateway",LOG_PID|LOG_CONS|LOG_NDELAY,LOG_LOCAL3);
	
	if( !ReadIni(inifile))
	{
	    printf("��ȡ�����ļ�[%s]ʧ��\n",inifile);
	    return -1;
	}
	
	writelog(LOG_DEBUG,"drtp_ip[%s],drtp_port[%d],mainfuncno[%d],list_port[%d]",g_para.drtp_ip, g_para.drtp_port, g_para.main_funcno,g_para.bank_lisnport);
	printf("\n drtp_ip[%s],drtp_port[%d],mainfuncno[%d],list_port[%d]\n",g_para.drtp_ip, g_para.drtp_port, g_para.main_funcno,g_para.bank_lisnport);
	if(!KS_YKT_Clt::Initialize(g_para.drtp_ip, g_para.drtp_port, g_para.main_funcno))
	{
		printf("----------��ʼ��ͨѶƽ̨ʧ��----------\n");
		return 	-1;
	}
		
	signal(SIGCHLD,SIG_IGN);
	signal(SIGINT,SIG_DFL);
	flag = tcpsocket.Create();
	if(!flag)
		exit(1);
	flag = tcpsocket.Listen(g_para.bank_lisnport);
	if(!flag)
		exit(1);
	while(1)
	{
			flag = tcpsocket.Accept(sockettmp);
			
			if(!flag)
				continue;
			if ((childpid = fork()) == 0)		/* �ӽ��� */
			{   
				tcpsocket.Close();  
				
				doProcess(sockettmp);     /* �������� */  
				
				sockettmp.Close();
				exit(0);  
			}  
			else if(childpid < 0)
			{
                		printf("�����ӽ���ʧ��\n");
			}
			sockettmp.Close(); 		/* ������ */  
	}
	tcpsocket.Close();
	KS_YKT_Clt::Uninitialize();
	closelog();
	return 0;
}

/****************************************************************************
*
*�ļ�(File):         d_upload.c
*
*�޸�(Modify):       2011/7/22 15:34:23
*
*����(Author):       USER
*
*����(Compile):      ����ƽ̨(Smart Platform)
*
*����(Description):
*
*
*
----------------------------------------------------------------------------
|
| Version | Datetime             |   Author    | Description
| --------+----------------------+-------------+----------------------------
|
| V1.00  2011/7/22 15:34:23           USER 
----------------------------------------------------------------------------
****************************************************************************/
#include "in_call.h"
#include "D12.h"
//void usb_upload();								//USB�����ϴ�
//int USBDownLongString(unsigned char DataBuffer[], unsigned int *DataLen);	//���մ�PC�˴�����������ݣ���ֲ��
//int USBUpLongString(unsigned char DataBuffer[], unsigned int DataLen);		//��PC�˷������ݣ���ֲ��
void myitoa(int cnt, char* temp);		//����ת�ַ���
/***********************************************************************
		module		:	[USB�����ϴ�����]
		function	:	[usb�ϴ��˵�]
  		return		:	[��]
		comment		:	[ȫ����ͨ����]
		machine		:	[EH-0818]
		language	:	[CHN]
 		keyword		:	[UPLOAD]
		date		:	[11/07/22]
 		author		:	[chen-zhengkai]
************************************************************************/

void usb_upload_menu()
{
	int select = -1;
	char db_menu_str[] =	"1. USB�ϴ�����";
	BROWINFO	info;
	info.iStr = db_menu_str;		//�������ָ��
	info.lPtr = 0;					//��ʾ����iStr����ʼ��ʾ��
	info.cPtr = 0;					//��ǰѡ����

	while (1) {
		//����BROWINFO�ṹ��Ա�����������ѭ�����п��ܻᱻEXT_Brow_Select�����ı�
		info.startLine = 0;				//��LCD�ϵ���ʾ��ʼ��
		info.dispLines = 1;				//��LCD�ϵ���ʾ����
		info.mInt = 1;					//��ʾ���ݵ�������
		info.lineMax = 14;				//ÿ������ַ���
		info.sFont = 0;					//7x9��������ʾ
		info.numEnable = 0;				//�Ƿ��������ּ����淽�����
		info.qEvent = EXIT_KEY_F1|EXIT_AUTO_QUIT|EXIT_KEY_POWER|EXIT_KEY_CANCEL;    //�ɵ��º����˳����¼���־
		info.autoexit = 1200;			//�Զ��˳���ʱ��
		//�˵�
		Disp_Clear();
		DispStr_CE(0, 0, "usb����˵�", DISP_CENTER);
		select = EXT_Brow_Select(&info);
		switch (select) {
			case 0:		//usb�ϴ�����
				if(USB_Init()) {
					DispStr_CE(0,2,"δ����",DISP_CENTER|DISP_CLRSCR);
					delay_and_wait_key(20, EXIT_KEY_ALL, 30);															
				}
				if ( !Usb_Data_Transmit() ) {
					DispStr_CE(0,6,"�����ѳɹ��ϴ�",DISP_CENTER|DISP_CLRSCR);
					DispStr_CE(0,8,"�����������",DISP_CENTER);
					delay_and_wait_key( 3, EXIT_KEY_ALL, 0 );
				}
				break;
			default:	//����CPUռ���ʣ������ܺ�
				if (info.qEvent == EXIT_KEY_F1  || EXIT_AUTO_QUIT 
                                || EXIT_KEY_POWER || EXIT_KEY_CANCEL) { //�����ϼ��˵� 
					return;
				}
				Sys_Power_Sleep(3);
				break;
		}
	}
}

/***********************************************************************
		module		:	[USB�����ϴ�����]
		function		:	[usb�ϴ����ݣ���������ʾ]
  		return		:	[��]
		comment	:	[ȫ����ͨ����]
		machine		:	[EH-0818]
		language	:	[CHN]
 		keyword		:	[UPLOAD]
		date			:	[11/07/22]
 		author		:	[chen-zhengkai]
************************************************************************/
void usb_upload()
{

	unsigned long	send_len = 0;			//�����ַ����ĳ���
	unsigned char 	send_buf[100] = {0};	//�����ַ���
	unsigned char	ret_buf[5] = {0};	//�ȴ�Ӧ��Ļ���
	unsigned int		ret_buf_len = 0;	//�ȴ�Ӧ�����泤��
//	char	comState = 0x00;			//ͨ��״̬:δ����
//	char state_len = 1;			//�ֽڳ���
	int ret = 0;		//��ʾ���
	char disBuf[20] = {0};	//��ʾ�ڴ�1
	char dspBuf[20] = {0};	//��ʾ�ڴ�2
	char* p_temp = NULL;
	char retBuf[] = "�����������";
	unsigned long	db_cnt = 0;	//���ݿ��Ѽ�¼������(������ɾ��)
	unsigned long	red_cnt = 0;	//��Ч���ݵ���Ŀ
	char red_flag = 0;				//��¼�Ƿ���Ч
	unsigned long idx = 1;			//���ڴ������������
	unsigned long cnt = 0;			//����
	unsigned char temp[20] = {0};	//��ʱ���棬���ݿ��¼��
	unsigned int temp_len = 0;

	db_cnt = DB_count_records(ATTENDANCE_INDEX);	//�������ݿ��Ѽ�¼������(������ɾ��)
	if (!db_cnt) {
		strcpy(disBuf, "���ݿ��޼�¼");
		DispStr_CE(0,6,disBuf,DISP_CENTER|DISP_CLRSCR);
		DispStr_CE(0,8,retBuf,DISP_CENTER);
		delay_and_wait_key( 3, EXIT_KEY_ALL, 0 );
		return;
	}
	else {
		if ( USB_Init() ) {	//USBû������
			strcpy(disBuf, "USBδ����");
			DispStr_CE(0,6,disBuf,DISP_CENTER|DISP_CLRSCR);
			DispStr_CE(0,8,retBuf,DISP_CENTER);
			delay_and_wait_key( 3, EXIT_KEY_ALL, 0 );
			return;
		}
		else {
#if 1
			strcpy(disBuf, "USB������");
			DispStr_CE(0,6,disBuf,DISP_CENTER|DISP_CLRSCR);
			DispStr_CE(0,8,retBuf,DISP_CENTER);
			//Sys_Delay_Sec(1);
			//����δ��ɾ���ļ�¼��
			for (cnt = 0; cnt < db_cnt; cnt++) {
				DB_jump_to_record(0, cnt, &red_flag);
				if ( !red_flag ) {	//��¼���ڲ���δ��ɾ��
					red_cnt++;
				}
			}
			while (1) {
				if ( KEY_Read() == KEY_F1 ) {
					return;
				}
				if ( !USBDownLongString(temp, &temp_len) ) {	//���ܿ�ʼѶ��
					ret =1;		//�յ���Ϣ
				}
				if ( !strncmp(temp, "start", 5) && ret == 1) {
					ret = 2;		//��ʼ�ϴ�
				}
				//�ϴ���¼
				if ( ret == 2 ) {
					DispStr_CE(0,6,"OYEAH",DISP_CENTER|DISP_CLRSCR);
					DispStr_CE(0,8,"�����������",DISP_CENTER);
					delay_and_wait_key( 3, EXIT_KEY_ALL, 0 );
					sprintf(disBuf, "��%d����¼", red_cnt);
					DispStr_CE(0,6,disBuf,DISP_CENTER|DISP_CLRSCR);

//					for ( cnt = 0; cnt < db_cnt && ret == 2; cnt++ ) {
						//��ʾ
					sprintf(dspBuf, "���ڴ�����%d��", idx);
					DispStr_CE(0,8,dspBuf,DISP_CENTER|DISP_CLRLINE);
						//�ϴ���¼
					cnt = 0;	//debug
					p_temp = (char*)DB_jump_to_record(0, cnt, &red_flag);
					if (!red_flag) {	//��¼���ڲ���δ��ɾ��
						memcpy(send_buf, p_temp, sizeof(USER_INFO));		//�浽���ͻ���
						send_len = strlen(send_buf);	//�������ݳ���
//						char s[20] = {0};
//						myitoa(send_len, s);
//						debugFun(s);		//�ȴ�ʱ�����������
						if ( USBUpLongString(send_buf, send_len) ) {	//�ϴ���PCʧ��
							ret = 0;
							break;
						}
						else {	//�ϴ���PC�ɹ�
							idx++;
							ret = 3;	//�ȴ�״̬���ȴ���һ�η�������
						}
					}
				}
				if ( idx >= red_cnt ) {
					DispStr_CE(0,6,"�����ϴ��ɹ�",DISP_CENTER|DISP_CLRSCR);
					DispStr_CE(0,8,"�����������",DISP_CENTER);
					delay_and_wait_key( 3, EXIT_KEY_ALL, 0 );
					return;
				}
				else {
					DispStr_CE(0,6,"�����ж�",DISP_CENTER|DISP_CLRSCR);
					DispStr_CE(0,8,"�����������",DISP_CENTER);
					delay_and_wait_key( 3, EXIT_KEY_ALL, 0 );
					return;
				}
			Sys_Delay_MS(3);
		}
#else
			while (1) {
				char data[10] = {0};
				int dataLen = 0;
				if ( KEY_Read() == KEY_F1 ) {
					return;
				}
				if ( !USBDownLongString(data, &dataLen) ) {
					DispStr_CE(0,6,"OYEAH",DISP_CENTER|DISP_CLRSCR);
					DispStr_CE(0,8,data,DISP_CENTER);
					delay_and_wait_key( 3, EXIT_KEY_ALL, 0 );
					if ( !USBUpLongString("1234567890", 10) ) {
						break;	
					}
				}
				Sys_Delay_MS(3);
			}
#endif
		}
	}
}
/***********************************************************************
		module		:	[USB�����ϴ�����]
		function		:	[���ݿ��¼ת�ַ���]
  		return		:	[��]
		comment	:	[ȫ����ͨ����]
		machine		:	[EH-0818]
		language	:	[CHN]
 		keyword		:	[UPLOAD]
		date			:	[11/07/25]
 		author		:	[chen-zhengkai]
************************************************************************/
void db_to_str(unsigned char* buf, int bufMax, int cnt)	/*buf������ַ���	bufmax���ַ����������	cnt����¼��*/
{
	int recIdx = 0;
	char* p_rec = NULL;
	char	rec_flag = 0;
	int idx_record = 0;
	
	for (; recIdx <cnt; recIdx++) {
		p_rec = (char*)DB_jump_to_record(0, recIdx, &rec_flag);
		if (!rec_flag) {	//��¼���ڲ���δ��ɾ��
			memcpy(buf+idx_record, p_rec, sizeof(USER_INFO));
			idx_record += sizeof(USER_INFO);
			if (idx_record >= bufMax) {
				return;
			}
		}
	}
}
#if 0
/***********************************************************************
		module		:	[USB�����ϴ�����]
		function		:	[��PC�˷�������]
  		return		:	[0 �����ɹ�
						-1 F1������
						-2 û��������PC]
		comment	:	[ȫ����ͨ����]
		machine		:	[EH-0818]
		language	:	[CHN]
 		keyword		:	[UPLOAD]
		date			:	[11/07/25]
 		author		:	[����]
************************************************************************/
int USBUpLongString(unsigned char DataBuffer[], unsigned int DataLen)
{
	int blk_cnt;						// ������
	int blk_res;						// ����1024�ֽڵ�ʣ���ֽ���
	int blk_idx=0;					// ѭ������
	int cnt_now;						// ���η����ֽ���
	int chr_idx;						// ����ѭ������
	short ret = -1;					// ��������ֵ		
	unsigned short i_st;					// �ж�����
	unsigned char recvbuf[4];		// ���ջ�����
	/*
	if(USB_Init())
	{
		ret = -2;
		return ret;
	}
	*/
	blk_cnt = (DataLen / 64);						// �������
	blk_res = (DataLen % 64);
	blk_cnt += ( (blk_res>0) ? 1 : 0 );
	blk_res = ((blk_res==0) ? 64 : blk_res);
	
	for(;;)
	{
		if(KEY_Read() == KEY_F1)	
		{
			ret = -1;
			goto end;
		}
		i_st = D12_Read_Interrupt_Register();				// ��ȡPDIUSBD12�жϼĴ���ֵ
		if(i_st != 0) 
		{
			if(i_st & D12_INT_SUSPENDCHANGE)
				USB_Suspend();								// ���߹���ı�
			if(i_st & D12_INT_ENDP0IN)
				USB_EP0_Txdone();							// ���ƶ˵㷢�����ݴ���
			if(i_st & D12_INT_ENDP0OUT)
				USB_EP0_Rxdone();							// ���ƶ˵�������ݴ���
			if(i_st & D12_INT_ENDP1OUT)
			{
				D12_Read_Last_Status(2);
				D12_Read_Endpoint(2,1,recvbuf);
				if(recvbuf[0] == 'S')
				{					
					D12_Read_Last_Status(3);
					D12_Write_Endpoint(3, 4, (unsigned char*)&DataLen);			
				}
				if(recvbuf[0] == 'E') 
				{
					break;
				}				
			}
			if(i_st & D12_INT_ENDP2OUT)
			{	
				D12_Read_Last_Status(4);
				D12_Read_Endpoint(4, 1, recvbuf);
				if(recvbuf[0] == 'S')
				{
					for(chr_idx = 0; chr_idx < 2; chr_idx++)	// һ�η��� 128 byte
					{
						if(blk_idx >= blk_cnt)
							break;
							 		
						cnt_now = ((blk_idx != (blk_cnt - 1)) ? 64 : blk_res );
						D12_Read_Last_Status(5);
						D12_Write_Endpoint(5, cnt_now, (DataBuffer + 64 * blk_idx));
						blk_idx++;	
					}
				}
			}
		}
	}
	ret = 0;
end:
//	USB_Disconnect();
	return ret;
}
#endif
/***********************************************************************
		module		:	[USB�����ϴ�����]
		function		:	[������ת�ַ���]
  		return		:	[��]
		comment	:	[ȫ����ͨ����]
		machine		:	[EH-0818]
		language	:	[CHN]
 		keyword		:	[UPLOAD]
		date			:	[11/08/05]
 		author		:	[chenzhengkai]
************************************************************************/
void myitoa(int cnt, char* temp)
{
	char t[20] = {0};
	int i = 0;
	int n = 0;
	if (cnt == 0) {
		temp[0] = '0';
		temp[1] = 0;
	}
	for (i = 0; cnt>0; i++) {
		t[i] = cnt%10 + '0';
		cnt /= 10;
		n++;
	}
	for (i = 0; i < n; i++) {
		temp[i] = t[n-1-i];
	}
}


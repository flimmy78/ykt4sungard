/*
 * AuthorityService.java  v1.00  2011-12-30
 * Peoject	smartcard-operator
 * Copyright (c) 2011 Sungard.China.HE
 *
 * Filename	:	AuthorityService.java  v1.00 2011-12-30
 * Project	: 	smartcard-operator
 * Copyight	:	Copyright (c) 2011 Sungard.China.HE
 */
package com.sungard.smartcard.bccsvr.modules.user.service;

import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sungard.smartcard.annotation.CrudType;
import com.sungard.smartcard.annotation.SmartCardFunction;
import com.sungard.smartcard.bccsvr.BccServerThread;
import com.sungard.smartcard.bccsvr.Function;
import com.sungard.smartcard.bccsvr.ServiceI;
import com.sungard.smartcard.bccsvr.modules.operator.domain.Operator;
import com.sungard.smartcard.bccsvr.modules.operator.domain.OperatorExample;
import com.sungard.smartcard.bccsvr.modules.user.dao.AuthorityMapper;
import com.sungard.smartcard.bccsvr.modules.user.domain.Authority;
import com.sungard.smartcard.bccsvr.modules.user.domain.AuthorityExample;
import com.sungard.smartcard.utils.drtp.TransfersNodeInfo;
import com.sungard.smartcard.utils.drtp.TransfersUtil;
import com.sungard.smartcard.utils.drtp.TransfersUtils;

/**
 * mybatis 服务.
 * 
 * @author <a href="mailto:jianggl88@gmail.com">蒋根亮</a>
 * @version v1.00
 * @since 1.00 2011-12-30
 * 
 */
@SmartCardFunction(infotype = 3, funcnum = 90000150, name = "AuthorityService")
public class AuthorityService implements ServiceI {

    private static final Logger logger = LoggerFactory.getLogger(AuthorityService.class);

    private AuthorityMapper authorityMapper;

    @Override
    public boolean doService(Function func, BccServerThread session) {
        logger.debug("AuthorityService - start");

        List<Authority> listA = TransfersUtils.getTransfersInObjects(Authority.class, session);

        boolean flag = false;

        String sstatus0 = "";// (String) session.GetFieldByName(0, "sstatus0");
        if (StringUtils.isBlank(sstatus0)) {
            sstatus0 = "Q";
        }
        switch (Enum.valueOf(CrudType.class, sstatus0)) {
        case A:
            break;
        case U:
            break;
        case D:
            break;
        case Q:
            flag = query(session);
            break;
        case Other:
            break;
        default:
            logger.debug("AuthorityService - 无处理应答");
            break;
        }

        if (!flag) {
            session.SetStringFieldByName("vsmess", "process successful!");
            session.PutRow(0);
        }
        session.DataDone(0);

        return true;
    }

    public boolean query(BccServerThread session) {

        long has = 0;
        long time = System.currentTimeMillis();
        SqlSession sqlSession = null;
        // getSqlSession();

        AuthorityMapper operatorMapper = sqlSession.getMapper(AuthorityMapper.class);
        AuthorityExample operatorExample = new AuthorityExample();
        operatorExample.createCriteria().andIdEqualTo(1L);
        List<Authority> list = operatorMapper.selectByExample(null);

        has = System.currentTimeMillis() - time;
        System.out.println("---------------------hasmybatis execute time :" + has);

        return TransfersUtils.TransfersAllRow(session, list, Authority.class);

    }

    public AuthorityMapper getAuthorityMapper() {
        return authorityMapper;
    }

    public void setAuthorityMapper(AuthorityMapper authorityMapper) {
        this.authorityMapper = authorityMapper;
    }

}
/*
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 *
 * Created Mon Oct 10 15:20:29 CST 2005 by MyEclipse Hibernate Tool.
 */
package com.kingstargroup.form;

import java.io.Serializable;

/**
 * A class that represents a row in the MAP_SERIAL_TABLE table. 
 * You can customize the behavior of this class by editing the class, {@link MapSerialTable()}.
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 */
public abstract class AbstractMapSerialTable 
    implements Serializable
{
    /** The cached hash code value for this instance.  Settting to 0 triggers re-calculation. */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Integer serino;

    /** The value of the simple seriType property. */
    private java.lang.Integer seriType;

    /** The value of the simple otherSeriNo property. */
    private java.lang.Integer otherSeriNo;

    /** The value of the simple serialState property. */
    private java.lang.Integer serialState;

    /** The value of the simple operateTime property. */
    private java.lang.String operateTime;

    /** The value of the simple collectDate property. */
    private java.lang.String collectDate;

    /** The value of the simple collectTime property. */
    private java.lang.String collectTime;

    /** The value of the simple operateDate property. */
    private java.lang.String operateDate;

    /** The value of the simple deviceId property. */
    private java.lang.Integer deviceId;

    /** The value of the simple fdevphyId property. */
    private java.lang.String fdevphyId;

    /** The value of the simple devphy999Id property. */
    private java.lang.String devphy999Id;

    /** The value of the simple cardId property. */
    private java.lang.Integer cardId;

    /** The value of the simple tradeFee property. */
    private java.lang.Double tradeFee;

    /** The value of the simple inBalance property. */
    private java.lang.Double inBalance;

    /** The value of the simple outBalance property. */
    private java.lang.Double outBalance;

    /** The value of the simple reviseserialNo property. */
    private java.lang.Integer reviseserialNo;

    /** The value of the simple abnormaltype property. */
    private java.lang.Integer abnormaltype;

    /** The value of the simple maindeviceId property. */
    private java.lang.Integer maindeviceId;

    /** The value of the simple contactname property. */
    private java.lang.String contactname;

    /**
     * Simple constructor of AbstractMapSerialTable instances.
     */
    public AbstractMapSerialTable()
    {
    }

    /**
     * Constructor of AbstractMapSerialTable instances given a simple primary key.
     * @param serino
     */
    public AbstractMapSerialTable(java.lang.Integer serino)
    {
        this.setSerino(serino);
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.Integer
     */
    public java.lang.Integer getSerino()
    {
        return serino;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param serino
     */
    public void setSerino(java.lang.Integer serino)
    {
        this.hashValue = 0;
        this.serino = serino;
    }

    /**
     * Return the value of the SERI_TYPE column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getSeriType()
    {
        return this.seriType;
    }

    /**
     * Set the value of the SERI_TYPE column.
     * @param seriType
     */
    public void setSeriType(java.lang.Integer seriType)
    {
        this.seriType = seriType;
    }

    /**
     * Return the value of the OTHER_SERI_NO column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getOtherSeriNo()
    {
        return this.otherSeriNo;
    }

    /**
     * Set the value of the OTHER_SERI_NO column.
     * @param otherSeriNo
     */
    public void setOtherSeriNo(java.lang.Integer otherSeriNo)
    {
        this.otherSeriNo = otherSeriNo;
    }

    /**
     * Return the value of the SERIAL_STATE column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getSerialState()
    {
        return this.serialState;
    }

    /**
     * Set the value of the SERIAL_STATE column.
     * @param serialState
     */
    public void setSerialState(java.lang.Integer serialState)
    {
        this.serialState = serialState;
    }

    /**
     * Return the value of the OPERATE_TIME column.
     * @return java.lang.String
     */
    public java.lang.String getOperateTime()
    {
        return this.operateTime;
    }

    /**
     * Set the value of the OPERATE_TIME column.
     * @param operateTime
     */
    public void setOperateTime(java.lang.String operateTime)
    {
        this.operateTime = operateTime;
    }

    /**
     * Return the value of the COLLECT_DATE column.
     * @return java.lang.String
     */
    public java.lang.String getCollectDate()
    {
        return this.collectDate;
    }

    /**
     * Set the value of the COLLECT_DATE column.
     * @param collectDate
     */
    public void setCollectDate(java.lang.String collectDate)
    {
        this.collectDate = collectDate;
    }

    /**
     * Return the value of the COLLECT_TIME column.
     * @return java.lang.String
     */
    public java.lang.String getCollectTime()
    {
        return this.collectTime;
    }

    /**
     * Set the value of the COLLECT_TIME column.
     * @param collectTime
     */
    public void setCollectTime(java.lang.String collectTime)
    {
        this.collectTime = collectTime;
    }

    /**
     * Return the value of the OPERATE_DATE column.
     * @return java.lang.String
     */
    public java.lang.String getOperateDate()
    {
        return this.operateDate;
    }

    /**
     * Set the value of the OPERATE_DATE column.
     * @param operateDate
     */
    public void setOperateDate(java.lang.String operateDate)
    {
        this.operateDate = operateDate;
    }

    /**
     * Return the value of the DEVICE_ID column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getDeviceId()
    {
        return this.deviceId;
    }

    /**
     * Set the value of the DEVICE_ID column.
     * @param deviceId
     */
    public void setDeviceId(java.lang.Integer deviceId)
    {
        this.deviceId = deviceId;
    }

    /**
     * Return the value of the FDEVPHY_ID column.
     * @return java.lang.String
     */
    public java.lang.String getFdevphyId()
    {
        return this.fdevphyId;
    }

    /**
     * Set the value of the FDEVPHY_ID column.
     * @param fdevphyId
     */
    public void setFdevphyId(java.lang.String fdevphyId)
    {
        this.fdevphyId = fdevphyId;
    }

    /**
     * Return the value of the DEVPHY999_ID column.
     * @return java.lang.String
     */
    public java.lang.String getDevphy999Id()
    {
        return this.devphy999Id;
    }

    /**
     * Set the value of the DEVPHY999_ID column.
     * @param devphy999Id
     */
    public void setDevphy999Id(java.lang.String devphy999Id)
    {
        this.devphy999Id = devphy999Id;
    }

    /**
     * Return the value of the CARD_ID column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getCardId()
    {
        return this.cardId;
    }

    /**
     * Set the value of the CARD_ID column.
     * @param cardId
     */
    public void setCardId(java.lang.Integer cardId)
    {
        this.cardId = cardId;
    }

    /**
     * Return the value of the TRADE_FEE column.
     * @return java.lang.Double
     */
    public java.lang.Double getTradeFee()
    {
        return this.tradeFee;
    }

    /**
     * Set the value of the TRADE_FEE column.
     * @param tradeFee
     */
    public void setTradeFee(java.lang.Double tradeFee)
    {
        this.tradeFee = tradeFee;
    }

    /**
     * Return the value of the IN_BALANCE column.
     * @return java.lang.Double
     */
    public java.lang.Double getInBalance()
    {
        return this.inBalance;
    }

    /**
     * Set the value of the IN_BALANCE column.
     * @param inBalance
     */
    public void setInBalance(java.lang.Double inBalance)
    {
        this.inBalance = inBalance;
    }

    /**
     * Return the value of the OUT_BALANCE column.
     * @return java.lang.Double
     */
    public java.lang.Double getOutBalance()
    {
        return this.outBalance;
    }

    /**
     * Set the value of the OUT_BALANCE column.
     * @param outBalance
     */
    public void setOutBalance(java.lang.Double outBalance)
    {
        this.outBalance = outBalance;
    }

    /**
     * Return the value of the REVISESERIAL_NO column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getReviseserialNo()
    {
        return this.reviseserialNo;
    }

    /**
     * Set the value of the REVISESERIAL_NO column.
     * @param reviseserialNo
     */
    public void setReviseserialNo(java.lang.Integer reviseserialNo)
    {
        this.reviseserialNo = reviseserialNo;
    }

    /**
     * Return the value of the ABNORMALTYPE column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getAbnormaltype()
    {
        return this.abnormaltype;
    }

    /**
     * Set the value of the ABNORMALTYPE column.
     * @param abnormaltype
     */
    public void setAbnormaltype(java.lang.Integer abnormaltype)
    {
        this.abnormaltype = abnormaltype;
    }

    /**
     * Return the value of the MAINDEVICE_ID column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getMaindeviceId()
    {
        return this.maindeviceId;
    }

    /**
     * Set the value of the MAINDEVICE_ID column.
     * @param maindeviceId
     */
    public void setMaindeviceId(java.lang.Integer maindeviceId)
    {
        this.maindeviceId = maindeviceId;
    }

    /**
     * Return the value of the CONTACTNAME column.
     * @return java.lang.String
     */
    public java.lang.String getContactname()
    {
        return this.contactname;
    }

    /**
     * Set the value of the CONTACTNAME column.
     * @param contactname
     */
    public void setContactname(java.lang.String contactname)
    {
        this.contactname = contactname;
    }

    /**
     * Implementation of the equals comparison on the basis of equality of the primary key values.
     * @param rhs
     * @return boolean
     */
    public boolean equals(Object rhs)
    {
        if (rhs == null)
            return false;
        if (! (rhs instanceof MapSerialTable))
            return false;
        MapSerialTable that = (MapSerialTable) rhs;
        if (this.getSerino() == null || that.getSerino() == null)
            return false;
        return (this.getSerino().equals(that.getSerino()));
    }

    /**
     * Implementation of the hashCode method conforming to the Bloch pattern with
     * the exception of array properties (these are very unlikely primary key types).
     * @return int
     */
    public int hashCode()
    {
        if (this.hashValue == 0)
        {
            int result = 17;
            int serinoValue = this.getSerino() == null ? 0 : this.getSerino().hashCode();
            result = result * 37 + serinoValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}
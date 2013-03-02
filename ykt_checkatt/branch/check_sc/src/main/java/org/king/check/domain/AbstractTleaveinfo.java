package org.king.check.domain;



/**
 * AbstractTleaveinfo generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractTleaveinfo extends org.king.framework.domain.BaseObject implements java.io.Serializable {


    // Fields    

     private String leaveId;
     private Integer custId;
     private String leaveTypeid;
     private String leaveInfo;
     private String validity;
     private String startdate;
     private String enddate;
     private String starttime;
     private String endtime;
     private String operId;
     private String operDate;
     private String operTime;
     private String remark;


    // Constructors

    /** default constructor */
    public AbstractTleaveinfo() {
    }

	/** minimal constructor */
    public AbstractTleaveinfo(Integer custId) {
        this.custId = custId;
    }
    
    /** full constructor */
    public AbstractTleaveinfo(Integer custId, String leaveTypeid, String leaveInfo, String validity, String startdate, String enddate, String starttime, String endtime, String operId, String operDate, String operTime, String remark) {
        this.custId = custId;
        this.leaveTypeid = leaveTypeid;
        this.leaveInfo = leaveInfo;
        this.validity = validity;
        this.startdate = startdate;
        this.enddate = enddate;
        this.starttime = starttime;
        this.endtime = endtime;
        this.operId = operId;
        this.operDate = operDate;
        this.operTime = operTime;
        this.remark = remark;
    }

   
    // Property accessors

    public String getLeaveId() {
        return this.leaveId;
    }
    
    public void setLeaveId(String leaveId) {
        this.leaveId = leaveId;
    }

    public Integer getCustId() {
        return this.custId;
    }
    
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getLeaveTypeid() {
        return this.leaveTypeid;
    }
    
    public void setLeaveTypeid(String leaveTypeid) {
        this.leaveTypeid = leaveTypeid;
    }

    public String getLeaveInfo() {
        return this.leaveInfo;
    }
    
    public void setLeaveInfo(String leaveInfo) {
        this.leaveInfo = leaveInfo;
    }

    public String getValidity() {
        return this.validity;
    }
    
    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getStartdate() {
        return this.startdate;
    }
    
    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return this.enddate;
    }
    
    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getStarttime() {
        return this.starttime;
    }
    
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return this.endtime;
    }
    
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getOperId() {
        return this.operId;
    }
    
    public void setOperId(String operId) {
        this.operId = operId;
    }

    public String getOperDate() {
        return this.operDate;
    }
    
    public void setOperDate(String operDate) {
        this.operDate = operDate;
    }

    public String getOperTime() {
        return this.operTime;
    }
    
    public void setOperTime(String operTime) {
        this.operTime = operTime;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
   








}
package org.king.checkinmanage.domain;

import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * AbstractStuFeeInfo generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractStuFeeInfo extends org.king.framework.domain.BaseObject implements java.io.Serializable {


    // Fields    

     private String id;
     private String studentNo;
     private String feeItem;
     private long shouldPay;
     private long exactPay;
     private String updatorId;
     private Date updateTime;


    // Constructors

    /** default constructor */
    public AbstractStuFeeInfo() {
    }

    
    /** full constructor */
    public AbstractStuFeeInfo(String studentNo, String feeItem, long shouldPay, long exactPay, String updatorId, Date updateTime) {
        this.studentNo = studentNo;
        this.feeItem = feeItem;
        this.shouldPay = shouldPay;
        this.exactPay = exactPay;
        this.updatorId = updatorId;
        this.updateTime = updateTime;
    }

   
    // Property accessors

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getStudentNo() {
        return this.studentNo;
    }
    
    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getFeeItem() {
        return this.feeItem;
    }
    
    public void setFeeItem(String feeItem) {
        this.feeItem = feeItem;
    }

    public long getShouldPay() {
        return this.shouldPay;
    }
    
    public void setShouldPay(long shouldPay) {
        this.shouldPay = shouldPay;
    }

    public long getExactPay() {
        return this.exactPay;
    }
    
    public void setExactPay(long exactPay) {
        this.exactPay = exactPay;
    }

    public String getUpdatorId() {
        return this.updatorId;
    }
    
    public void setUpdatorId(String updatorId) {
        this.updatorId = updatorId;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (!(object instanceof AbstractStuFeeInfo)) {
			return false;
		}
		AbstractStuFeeInfo rhs = (AbstractStuFeeInfo) object;
		return new EqualsBuilder().append(this.updateTime, rhs.updateTime)
				.append(this.studentNo, rhs.studentNo).append(this.updatorId,
						rhs.updatorId).append(this.shouldPay, rhs.shouldPay)
				.append(this.id, rhs.id).append(this.exactPay, rhs.exactPay)
				.append(this.feeItem, rhs.feeItem).isEquals();
	}


	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(-2024927437, 613264185).append(
				this.updateTime).append(this.studentNo).append(this.updatorId)
				.append(this.shouldPay).append(this.id).append(this.exactPay)
				.append(this.feeItem).toHashCode();
	}


	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("updateTime", this.updateTime).append("studentNo",
						this.studentNo).append("updatorId", this.updatorId)
				.append("shouldPay", this.shouldPay).append("id", this.id)
				.append("exactPay", this.exactPay).append("feeItem",
						this.feeItem).toString();
	}
   








}
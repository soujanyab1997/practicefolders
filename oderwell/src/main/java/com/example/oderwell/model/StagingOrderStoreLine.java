package com.example.oderwell.model;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StagingOrderStoreLine {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int uplOrderlineNum;
	private String uplorderid;
	private String groupid;
	private int groupseqnbr;
	private int purchaseCompanyId;
	private String actionCode;
	private String poNum;
	private String poLinenum;
	private int itemNum;
	private int orderQty;
	private String orderQtyUOM;
	private int msgNum;
	private int orderStatusCode;
	private int didNum;
	private String deptNum;
	private Date createTimeStamp;
	private String createdUserId;
	private Date lastChangeTimeStamp;
	private String lastChangeUserId;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")

	private StagingStoreOrder stagingStoreOrder;
	
	public StagingOrderStoreLine() {
		super();
	}




	public StagingOrderStoreLine(int uplOrderlineNum, String uplorderid, String groupid, int groupseqnbr,
			int purchaseCompanyId, String actionCode, String poNum, String poLinenum, int itemNum, int orderQty,
			String orderQtyUOM, int msgNum, int orderStatusCode, int didNum, String deptNum, Date createTimeStamp,
			String createdUserId, Date lastChangeTimeStamp, String lastChangeUserId,
			StagingStoreOrder stagingStoreOrder) {
		super();
		this.uplOrderlineNum = uplOrderlineNum;
		this.uplorderid = uplorderid;
		this.groupid = groupid;
		this.groupseqnbr = groupseqnbr;
		this.purchaseCompanyId = purchaseCompanyId;
		this.actionCode = actionCode;
		this.poNum = poNum;
		this.poLinenum = poLinenum;
		this.itemNum = itemNum;
		this.orderQty = orderQty;
		this.orderQtyUOM = orderQtyUOM;
		this.msgNum = msgNum;
		this.orderStatusCode = orderStatusCode;
		this.didNum = didNum;
		this.deptNum = deptNum;
		this.createTimeStamp = createTimeStamp;
		this.createdUserId = createdUserId;
		this.lastChangeTimeStamp = lastChangeTimeStamp;
		this.lastChangeUserId = lastChangeUserId;
		this.stagingStoreOrder = stagingStoreOrder;
	}




	public String getGroupid() {
		return groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public int getGroupseqnbr() {
		return groupseqnbr;
	}

	public void setGroupseqnbr(int groupseqnbr) {
		this.groupseqnbr = groupseqnbr;
	}

	public int getPurchaseCompanyId() {
		return purchaseCompanyId;
	}

	public void setPurchaseCompanyId(int purchaseCompanyId) {
		this.purchaseCompanyId = purchaseCompanyId;
	}

	public String getActionCode() {
		return actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}


	public String getPoNum() {
		return poNum;
	}

	public void setPoNum(String poNum) {
		this.poNum = poNum;
	}

	public String getPoLinenum() {
		return poLinenum;
	}

	public void setPoLinenum(String poLinenum) {
		this.poLinenum = poLinenum;
	}

	public int getItemNum() {
		return itemNum;
	}

	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}

	public int getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(int orderQty) {
		this.orderQty = orderQty;
	}

	public String getOrderQtyUOM() {
		return orderQtyUOM;
	}

	public void setOrderQtyUOM(String orderQtyUOM) {
		this.orderQtyUOM = orderQtyUOM;
	}

	public int getMsgNum() {
		return msgNum;
	}

	public void setMsgNum(int msgNum) {
		this.msgNum = msgNum;
	}

	public int getOrderStatusCode() {
		return orderStatusCode;
	}

	public void setOrderStatusCode(int orderStatusCode) {
		this.orderStatusCode = orderStatusCode;
	}

	public int getDidNum() {
		return didNum;
	}

	public void setDidNum(int didNum) {
		this.didNum = didNum;
	}

	public String getDeptNum() {
		return deptNum;
	}

	public void setDeptNum(String deptNum) {
		this.deptNum = deptNum;
	}

	public Date getCreateTimeStamp() {
		return createTimeStamp;
	}

	public void setCreateTimeStamp(Date createTimeStamp) {
		this.createTimeStamp = createTimeStamp;
	}

	public String getCreatedUserId() {
		return createdUserId;
	}

	public void setCreatedUserId(String createdUserId) {
		this.createdUserId = createdUserId;
	}

	public Date getLastChangeTimeStamp() {
		return lastChangeTimeStamp;
	}

	public void setLastChangeTimeStamp(Date lastChangeTimeStamp) {
		this.lastChangeTimeStamp = lastChangeTimeStamp;
	}

	public String getLastChangeUserId() {
		return lastChangeUserId;
	}

	public void setLastChangeUserId(String lastChangeUserId) {
		this.lastChangeUserId = lastChangeUserId;
	}



	public int getUplOrderlineNum() {
		return uplOrderlineNum;
	}

	public void setUplOrderlineNum(int uplOrderlineNum) {
		this.uplOrderlineNum = uplOrderlineNum;
	}

	public String getUplorderid() {
		return uplorderid;
	}

	public void setUplorderid(String uplorderid) {
		this.uplorderid = uplorderid;
	}

	public StagingStoreOrder getStagingStoreOrder() {
		return stagingStoreOrder;
	}

	public void setStagingStoreOrder(StagingStoreOrder stagingStoreOrder) {
		this.stagingStoreOrder = stagingStoreOrder;
	}


}

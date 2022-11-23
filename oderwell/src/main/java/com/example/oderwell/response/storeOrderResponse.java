package com.example.oderwell.response;

import java.util.Date;

public class storeOrderResponse {

	private int sourceNum;
	private int wmtnumb;
	private int destinationNum;
	private int orderTrackingNum;
	private int baseDivisonNum;
	private int deptNum;
	private String destCountryCode;
	private String needType;
	private String msgType;
	private String orderRecordType;
	private String packType;
	private int poLineNum;
	private String poNum;
	private String poType;
	private String priorityReason;
	private int priorityNum;
	private String processName;
	private int quantity;
	private String reason;
	private String sourceCountryCode;
	private String status;
	private int vnpkQty;
	private int whpkQty;
	private int upcNum;
	private int quantityUOM;
	private boolean substitutable;
	private String orderType;
	private int wareHouseAreacode;
	private Date orderDate;
	public storeOrderResponse() {
		super();
	}
	public storeOrderResponse(int sourceNum, int wmtnumb, int destinationNum, int orderTrackingNum, int baseDivisonNum,
			int deptNum, String destCountryCode, String needType, String msgType, String orderRecordType,
			String packType, int poLineNum, String poNum, String poType, String priorityReason, int priorityNum,
			String processName, int quantity, String reason, String sourceCountryCode, String status, int vnpkQty,
			int whpkQty, int upcNum, int quantityUOM, boolean substitutable, String orderType, int wareHouseAreacode,
			Date orderDate) {
		super();
		this.sourceNum = sourceNum;
		this.wmtnumb = wmtnumb;
		this.destinationNum = destinationNum;
		this.orderTrackingNum = orderTrackingNum;
		this.baseDivisonNum = baseDivisonNum;
		this.deptNum = deptNum;
		this.destCountryCode = destCountryCode;
		this.needType = needType;
		this.msgType = msgType;
		this.orderRecordType = orderRecordType;
		this.packType = packType;
		this.poLineNum = poLineNum;
		this.poNum = poNum;
		this.poType = poType;
		this.priorityReason = priorityReason;
		this.priorityNum = priorityNum;
		this.processName = processName;
		this.quantity = quantity;
		this.reason = reason;
		this.sourceCountryCode = sourceCountryCode;
		this.status = status;
		this.vnpkQty = vnpkQty;
		this.whpkQty = whpkQty;
		this.upcNum = upcNum;
		this.quantityUOM = quantityUOM;
		this.substitutable = substitutable;
		this.orderType = orderType;
		this.wareHouseAreacode = wareHouseAreacode;
		this.orderDate = orderDate;
	}
	public int getSourceNum() {
		return sourceNum;
	}
	public void setSourceNum(int sourceNum) {
		this.sourceNum = sourceNum;
	}
	public int getWmtnumb() {
		return wmtnumb;
	}
	public void setWmtnumb(int wmtnumb) {
		this.wmtnumb = wmtnumb;
	}
	public int getDestinationNum() {
		return destinationNum;
	}
	public void setDestinationNum(int destinationNum) {
		this.destinationNum = destinationNum;
	}
	public int getOrderTrackingNum() {
		return orderTrackingNum;
	}
	public void setOrderTrackingNum(int orderTrackingNum) {
		this.orderTrackingNum = orderTrackingNum;
	}
	public int getBaseDivisonNum() {
		return baseDivisonNum;
	}
	public void setBaseDivisonNum(int baseDivisonNum) {
		this.baseDivisonNum = baseDivisonNum;
	}
	public int getDeptNum() {
		return deptNum;
	}
	public void setDeptNum(int deptNum) {
		this.deptNum = deptNum;
	}
	public String getDestCountryCode() {
		return destCountryCode;
	}
	public void setDestCountryCode(String destCountryCode) {
		this.destCountryCode = destCountryCode;
	}
	public String getNeedType() {
		return needType;
	}
	public void setNeedType(String needType) {
		this.needType = needType;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getOrderRecordType() {
		return orderRecordType;
	}
	public void setOrderRecordType(String orderRecordType) {
		this.orderRecordType = orderRecordType;
	}
	public String getPackType() {
		return packType;
	}
	public void setPackType(String packType) {
		this.packType = packType;
	}
	public int getPoLineNum() {
		return poLineNum;
	}
	public void setPoLineNum(int poLineNum) {
		this.poLineNum = poLineNum;
	}
	public String getPoNum() {
		return poNum;
	}
	public void setPoNum(String poNum) {
		this.poNum = poNum;
	}
	public String getPoType() {
		return poType;
	}
	public void setPoType(String poType) {
		this.poType = poType;
	}
	public String getPriorityReason() {
		return priorityReason;
	}
	public void setPriorityReason(String priorityReason) {
		this.priorityReason = priorityReason;
	}
	public int getPriorityNum() {
		return priorityNum;
	}
	public void setPriorityNum(int priorityNum) {
		this.priorityNum = priorityNum;
	}
	public String getProcessName() {
		return processName;
	}
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getSourceCountryCode() {
		return sourceCountryCode;
	}
	public void setSourceCountryCode(String sourceCountryCode) {
		this.sourceCountryCode = sourceCountryCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getVnpkQty() {
		return vnpkQty;
	}
	public void setVnpkQty(int vnpkQty) {
		this.vnpkQty = vnpkQty;
	}
	public int getWhpkQty() {
		return whpkQty;
	}
	public void setWhpkQty(int whpkQty) {
		this.whpkQty = whpkQty;
	}
	public int getUpcNum() {
		return upcNum;
	}
	public void setUpcNum(int upcNum) {
		this.upcNum = upcNum;
	}
	public int getQuantityUOM() {
		return quantityUOM;
	}
	public void setQuantityUOM(int quantityUOM) {
		this.quantityUOM = quantityUOM;
	}
	public boolean isSubstitutable() {
		return substitutable;
	}
	public void setSubstitutable(boolean substitutable) {
		this.substitutable = substitutable;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public int getWareHouseAreacode() {
		return wareHouseAreacode;
	}
	public void setWareHouseAreacode(int wareHouseAreacode) {
		this.wareHouseAreacode = wareHouseAreacode;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
}

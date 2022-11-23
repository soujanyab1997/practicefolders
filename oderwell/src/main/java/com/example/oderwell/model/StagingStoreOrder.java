package com.example.oderwell.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class StagingStoreOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String uplorderid;
	private String groupid;
	private int groupseqnbr;
	private int facilitynbr;
	private String facilitycntrycode;
	private int srcfacilitynbr;
	private String srcfacilitycountrycode;
	private Date srcrderCreationTimestamp; 
	private String destinationCountryCode;
	
	private int warehouseOrderNumber;
	private String destfacilityCountryCode;
	private int orderRecordTypeCode;
	private int orderStatuscode;
	private int status;
	private Date createTimeStamp;
	private String craeteUserId;
	private Date lastchangedTimestamp;
	private String lastChangedUserId;
	private Date orderDownloadDate;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "stagingStoreOrder",fetch = FetchType.LAZY)
	private List<StagingOrderStoreLine> StagingOrderStoreLine = new ArrayList<>();
	public StagingStoreOrder() {
		super();
	}
	
	public StagingStoreOrder(String uplorderid, String groupid, int groupseqnbr, int facilitynbr,
			String facilitycntrycode, int srcfacilitynbr, String srcfacilitycountrycode, Date srcrderCreationTimestamp,
			String destinationCountryCode, int warehouseOrderNumber, String destfacilityCountryCode,
			int orderRecordTypeCode, int orderStatuscode, int status, Date createTimeStamp, String craeteUserId,
			Date lastchangedTimestamp, String lastChangedUserId, Date orderDownloadDate,
			List<com.example.oderwell.model.StagingOrderStoreLine> stagingOrderStoreLine) {
		super();
		this.uplorderid = uplorderid;
		this.groupid = groupid;
		this.groupseqnbr = groupseqnbr;
		this.facilitynbr = facilitynbr;
		this.facilitycntrycode = facilitycntrycode;
		this.srcfacilitynbr = srcfacilitynbr;
		this.srcfacilitycountrycode = srcfacilitycountrycode;
		this.srcrderCreationTimestamp = srcrderCreationTimestamp;
		this.destinationCountryCode = destinationCountryCode;
		this.warehouseOrderNumber = warehouseOrderNumber;
		this.destfacilityCountryCode = destfacilityCountryCode;
		this.orderRecordTypeCode = orderRecordTypeCode;
		this.orderStatuscode = orderStatuscode;
		this.status = status;
		this.createTimeStamp = createTimeStamp;
		this.craeteUserId = craeteUserId;
		this.lastchangedTimestamp = lastchangedTimestamp;
		this.lastChangedUserId = lastChangedUserId;
		this.orderDownloadDate = orderDownloadDate;
		StagingOrderStoreLine = stagingOrderStoreLine;
	}

	public String getUplorderid() {
		return uplorderid;
	}
	public void setUplorderid(String uplorderid) {
		this.uplorderid = uplorderid;
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
	public int getFacilitynbr() {
		return facilitynbr;
	}
	public void setFacilitynbr(int facilitynbr) {
		this.facilitynbr = facilitynbr;
	}
	public String getFacilitycntrycode() {
		return facilitycntrycode;
	}
	public void setFacilitycntrycode(String facilitycntrycode) {
		this.facilitycntrycode = facilitycntrycode;
	}
	public int getSrcfacilitynbr() {
		return srcfacilitynbr;
	}
	public void setSrcfacilitynbr(int srcfacilitynbr) {
		this.srcfacilitynbr = srcfacilitynbr;
	}
	public String getSrcfacilitycountrycode() {
		return srcfacilitycountrycode;
	}
	public void setSrcfacilitycountrycode(String srcfacilitycountrycode) {
		this.srcfacilitycountrycode = srcfacilitycountrycode;
	}
	public Date getSrcrderCreationTimestamp() {
		return srcrderCreationTimestamp;
	}
	public void setSrcrderCreationTimestamp(Date srcrderCreationTimestamp) {
		this.srcrderCreationTimestamp = srcrderCreationTimestamp;
	}
	public String getDestinationCountryCode() {
		return destinationCountryCode;
	}
	public void setDestinationCountryCode(String destinationCountryCode) {
		this.destinationCountryCode = destinationCountryCode;
	}
	public int getWarehouseOrderNumber() {
		return warehouseOrderNumber;
	}
	public void setWarehouseOrderNumber(int warehouseOrderNumber) {
		this.warehouseOrderNumber = warehouseOrderNumber;
	}
	public String getDestfacilityCountryCode() {
		return destfacilityCountryCode;
	}
	public void setDestfacilityCountryCode(String destfacilityCountryCode) {
		this.destfacilityCountryCode = destfacilityCountryCode;
	}
	public int getOrderRecordTypeCode() {
		return orderRecordTypeCode;
	}
	public void setOrderRecordTypeCode(int orderRecordTypeCode) {
		this.orderRecordTypeCode = orderRecordTypeCode;
	}
	public int getOrderStatuscode() {
		return orderStatuscode;
	}
	public void setOrderStatuscode(int orderStatuscode) {
		this.orderStatuscode = orderStatuscode;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getCreateTimeStamp() {
		return createTimeStamp;
	}
	public void setCreateTimeStamp(Date createTimeStamp) {
		this.createTimeStamp = createTimeStamp;
	}
	public String getCraeteUserId() {
		return craeteUserId;
	}
	public void setCraeteUserId(String craeteUserId) {
		this.craeteUserId = craeteUserId;
	}
	public Date getLastchangedTimestamp() {
		return lastchangedTimestamp;
	}
	public void setLastchangedTimestamp(Date lastchangedTimestamp) {
		this.lastchangedTimestamp = lastchangedTimestamp;
	}
	public String getLastChangedUserId() {
		return lastChangedUserId;
	}
	public void setLastChangedUserId(String lastChangedUserId) {
		this.lastChangedUserId = lastChangedUserId;
	}
	public Date getOrderDownloadDate() {
		return orderDownloadDate;
	}
	public void setOrderDownloadDate(Date orderDownloadDate) {
		this.orderDownloadDate = orderDownloadDate;
	}

	public List<StagingOrderStoreLine> getStagingOrderStoreLine() {
		return StagingOrderStoreLine;
	}

	public void setStagingOrderStoreLine(List<StagingOrderStoreLine> stagingOrderStoreLineparam) {
		System.out.println("setter of setStagingOrderStoreLine ");
		//StagingOrderStoreLine = stagingOrderStoreLine;
		System.out.println(stagingOrderStoreLineparam.size());
		System.out.println("stagingOrderStoreLine .... "+stagingOrderStoreLineparam);
	//	this.StagingOrderStoreLine.add(stagingOrderStoreLine);
		 for (StagingOrderStoreLine stl: stagingOrderStoreLineparam) {
			 System.out.println( "setter stl"+stl);
		    //  stl.setStagingStoreOrder(this);
		      StagingOrderStoreLine.add(stl);
		    }
	}
	
	
}

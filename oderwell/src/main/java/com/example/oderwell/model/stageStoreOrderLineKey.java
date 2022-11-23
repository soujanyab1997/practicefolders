package com.example.oderwell.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class stageStoreOrderLineKey implements Serializable {

	private String uplorderid;
	private int uplOrderlineNum;
	
	public stageStoreOrderLineKey() {
		super();
	}

	public stageStoreOrderLineKey(String uplorderid, int uplOrderlineNum) {
		super();
		this.uplorderid = uplorderid;
		this.uplOrderlineNum = uplOrderlineNum;
	}

	public String getUplorderid() {
		return uplorderid;
	}

	public void setUplorderid(String uplorderid) {
		this.uplorderid = uplorderid;
	}

	public int getUplOrderlineNum() {
		return uplOrderlineNum;
	}

	public void setUplOrderlineNum(int uplOrderlineNum) {
		this.uplOrderlineNum = uplOrderlineNum;
	} 
	
	
}

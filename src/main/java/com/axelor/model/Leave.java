package com.axelor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Leave {

	@Id
	@GeneratedValue
	private String id;
	private String leaveType;
	private String nod;
	private String fromDate;
	private String toDate;
	private String applyDate;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getApplyDate() {
		return applyDate;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public String getNod() {
		return nod;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getToDate() {
		return toDate;
	}

	public void setNod(String nod) {
		this.nod = nod;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

}

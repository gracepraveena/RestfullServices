package com.springboot.restfullservices;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int eid;
	private String ename;
	private int eage;
	private String branch;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Employee(int eid, String ename, int eage, String branch) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.branch = branch;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", branch=" + branch + "]";
	}
	
}

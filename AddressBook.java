package com.example.demo.Bean;

import java.util.Date;

public class AddressBook {
	String projectName;
	String abName;
	String registerName;
	String updateName;
	Date updateTime;
	public AddressBook(String projectName, String abname, String registerName, String updateName, Date updatetime) {
		super();
		this.projectName = projectName;
		this.abName = abname;
		this.registerName = registerName;
		this.updateName = updateName;
		this.updateTime = updatetime;
	}
	public AddressBook() {
		super();
	}
	@Override
	public String toString() {
		return "AddressBook [projectName=" + projectName + ", abname=" + abName + ", registerName=" + registerName
				+ ", updateName=" + updateName + ", updatetime=" + updateTime + "]";
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getAbname() {
		return abName;
	}
	public void setAbname(String abname) {
		this.abName = abname;
	}
	public String getRegisterName() {
		return registerName;
	}
	public void setRegisterName(String registerName) {
		this.registerName = registerName;
	}
	public String getUpdateName() {
		return updateName;
	}
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}
	public Date getUpdatetime() {
		return updateTime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updateTime = updatetime;
	}
	
}

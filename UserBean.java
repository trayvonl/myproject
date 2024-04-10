package com.example.demo.Bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.NotBlank;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserBean {
	int code;
	private Integer id;
	@NotBlank(message = "用户名不能为空")
	private String userName;
	@NotBlank(message = "密码用户名不能为空")
	private String passWord;
	private Date gmtCreated;
	private Date gmtModified;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Date getGmtCreated() {
		return gmtCreated;
	}
	public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}
	public Date getGmtModified() {
		return gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	@Override
	public String toString() {
		return "UserBean [code=" + code + ", id=" + id + ", userName=" + userName + ", passWord=" + passWord
				+ ", gmtCreated=" + gmtCreated + ", gmtModified=" + gmtModified + "]";
	}
	public UserBean(int code, Integer id, @NotBlank(message = "用户名不能为空") String userName,
			@NotBlank(message = "密码用户名不能为空") String passWord, Date gmtCreated, Date gmtModified) {
		super();
		this.code = code;
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.gmtCreated = gmtCreated;
		this.gmtModified = gmtModified;
	}
	public UserBean() {
		super();
		}
}

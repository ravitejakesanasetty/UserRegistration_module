package com.sp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class User {
	@Id
	@GeneratedValue
  private Integer userId;
  private String userName;
  private String address;
  private String qualification;
  private String mobile;
  private String password;
  
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", address=" + address + ", qualification="
			+ qualification + ", mobile=" + mobile + ", password=" + password + "]";
}
public User(Integer userId, String userName, String address, String qualification, String mobile, String password) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.address = address;
	this.qualification = qualification;
	this.mobile = mobile;
	this.password = password;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}

  
  
}

package com.educationloan.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AdminModel")
public class AdminModel {

	@Id
	@Column(name="Email")
	private String email;
	@Override
	public String toString() {
		return "AdminModel [email=" + email + ", password=" + password + ", mobileNumber=" + mobileNumber
				+ ", userRole=" + userRole + "]";
	}
	public AdminModel() {
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	@Column(name="Password")
	private String password;
	@Column(name="MobileNumber")
	private String mobileNumber;
	@Column(name="UserRole")
	private String userRole;
	
}
//Email: String
//Password: String
//MobileNumber: String
//UserRole: String

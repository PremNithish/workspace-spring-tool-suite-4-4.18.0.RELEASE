package com.educationloan.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="UserModel")
public class UserModel {

	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	@Column(name="Email")
	private String email;
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", email=" + email + ", username=" + username + ", password=" + password
				+ ", mobileNumber=" + mobileNumber + ", userrole=" + userrole + "]";
	}
	public UserModel() {
		super();
	}
	@Column(name="Username")
	private String username;
	@Column(name="Password")
	private String password;
	@Column(name="MobileNumber")
	private String mobileNumber;
	@Column(name="UserRole")
	private String userrole;
	
}

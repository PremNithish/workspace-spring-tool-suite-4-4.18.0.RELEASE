package com.instagram.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "persons")
public class Persons {

	
	    @Id
	    @GeneratedValue
	    private Long id;
	    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
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
		public Persons() {
			super();
		}
		private String name;
	    @Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", address="
					+ address + "]";
		}
		private String email;
	    private String password;
	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "address_id")
	 	private Address address;
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
	}


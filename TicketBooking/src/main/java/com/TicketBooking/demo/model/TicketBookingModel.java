package com.TicketBooking.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TicketBookingDetails")
public class TicketBookingModel {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Override
	public String toString() {
		return "TicketBookingModel [id=" + id + ", tbookingfrom=" + tbookingfrom + ", tbookingto=" + tbookingto
				+ ", tbookingdate=" + tbookingdate + ", tbookingclass=" + tbookingclass + ", tbookingcompartment="
				+ tbookingcompartment + "]";
	}
	public TicketBookingModel() {
		super();
	}
	@Column(name="from")
	private String tbookingfrom;
	@Column(name="to")
	private String tbookingto;
	@Column(name="date")
	private String tbookingdate;
	@Column(name="bookingclass")
	private String tbookingclass;
	@Column(name="compartment")
	private String tbookingcompartment;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTbookingfrom() {
		return tbookingfrom;
	}
	public void setTbookingfrom(String tbookingfrom) {
		this.tbookingfrom = tbookingfrom;
	}
	public String getTbookingto() {
		return tbookingto;
	}
	public void setTbookingto(String tbookingto) {
		this.tbookingto = tbookingto;
	}
	public String getTbookingdate() {
		return tbookingdate;
	}
	public void setTbookingdate(String tbookingdate) {
		this.tbookingdate = tbookingdate;
	}
	public String getTbookingclass() {
		return tbookingclass;
	}
	public void setTbookingclass(String tbookingclass) {
		this.tbookingclass = tbookingclass;
	}
	public String getTbookingcompartment() {
		return tbookingcompartment;
	}
	public void setTbookingcompartment(String tbookingcompartment) {
		this.tbookingcompartment = tbookingcompartment;
	}
}

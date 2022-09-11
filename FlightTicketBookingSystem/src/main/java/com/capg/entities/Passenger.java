package com.capg.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Passenger {

	private int passengerId;
	private String fname;
	private String lname;
	private int age;
	private String gender;
	private String passportNo;
	private String seatNo;
	
	private Booking booking;

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(int passengerId, String fname, String lname, int age, String gender,
			String passportNo, String seatNo) {
		super();
		this.passengerId = passengerId;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.gender = gender;
		this.passportNo = passportNo;
		this.seatNo = seatNo;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	@OneToMany
	@JoinColumn(name = "bookingId")
	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", fname=" + fname + ", lname=" + lname + ", age=" + age
				+ ", gender=" + gender + ", passportNo=" + passportNo + ", seatNo=" + seatNo + ", booking=" + booking
				+ "]";
	}

	
	
}

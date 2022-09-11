
package com.capg.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/*public class Passenger {

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
======= */

public class Passenger {
	private int passangerId;
	private int bookingId;
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	private String passportNumber;
	private int seatNumber;
	private Booking booking;
	
	public Passenger(int passangerId, int bookingId, String firstName, String lastName, int age, char gender,
			String passportNumber, int seatNumber/*, Booking booking*/) {
		super();
		this.passangerId = passangerId;
		this.bookingId = bookingId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.passportNumber = passportNumber;
		this.seatNumber = seatNumber;
		//this.booking=booking;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getPassangerId() {
		return passangerId;
	}
	public void setPassangerId(int passangerId) {
		this.passangerId = passangerId;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
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
		return "Passenger [passangerId=" + passangerId + ", bookingId=" + bookingId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", gender=" + gender + ", passportNumber="
				+ passportNumber + ", seatNumber=" + seatNumber /*+",booking=\n" + booking*/ +"]";
	}
	
	

}
//>>>>>>> branch 'master' of https://github.com/rachanaamr/Sprint-1---Flight-booking-system-Colab.git

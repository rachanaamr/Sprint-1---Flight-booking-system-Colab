package com.capg.entities;

public class Passenger {
	private int passangerId;
	private int bookingId;
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	private String passportNumber;
	private int seatNumber;
	public Passenger(int passangerId, int bookingId, String firstName, String lastName, int age, char gender,
			String passportNumber, int seatNumber) {
		super();
		this.passangerId = passangerId;
		this.bookingId = bookingId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.passportNumber = passportNumber;
		this.seatNumber = seatNumber;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	@Override
	public String toString() {
		return "Passenger [passangerId=" + passangerId + ", bookingId=" + bookingId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", gender=" + gender + ", passportNumber="
				+ passportNumber + ", seatNumber=" + seatNumber + "]";
	}
	
	

}

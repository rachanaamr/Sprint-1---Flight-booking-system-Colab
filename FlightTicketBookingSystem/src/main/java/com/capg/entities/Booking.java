package com.capg.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {

	private int bookingId;
//	private int userId;
//	private int flightId;
	private Date bookingDate;
	private Date travelDate;
	private double totalCost;
	private int seatsBooked;
	
	private User user;
	
	private Flight flight;

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(int bookingId, Date bookingDate, Date travelDate, double totalCost,
			int seatsBooked) {
		super();
		this.bookingId = bookingId;
//		this.userId = userId;
//		this.flightId = flightId;
		this.bookingDate = bookingDate;
		this.travelDate = travelDate;
		this.totalCost = totalCost;
		this.seatsBooked = seatsBooked;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public int getSeatsBooked() {
		return seatsBooked;
	}

	public void setSeatsBooked(int seatsBooked) {
		this.seatsBooked = seatsBooked;
	}
	

	@OneToOne
	@JoinColumn(name = "userId")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	@OneToMany
	@JoinColumn(name = "flightId")
	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", travelDate=" + travelDate 
				+ ", totalCost=" + totalCost + ", seatsBooked=" + seatsBooked + ", user=" + user + ", flight=" 
				+ flight + "]";
	}
}

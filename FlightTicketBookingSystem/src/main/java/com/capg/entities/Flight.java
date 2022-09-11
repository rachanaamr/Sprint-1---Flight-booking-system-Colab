package com.capg.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {
	
	@Id
	private int flightId;
	private String src;
	private String dest;
	private String deptTime;
	private String arrTime;
	private int fare;
	private Date date;
	private int duration;
	private int availableSeats;
	
	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(int flightId, String src, String dest, String deptTime, String arrTime, int fare, Date date,
			int duration, int availableSeats) {
		super();
		this.flightId = flightId;
		this.src = src;
		this.dest = dest;
		this.deptTime = deptTime;
		this.arrTime = arrTime;
		this.fare = fare;
		this.date = date;
		this.duration = duration;
		this.availableSeats = availableSeats;
	}
	
	
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getDeptTime() {
		return deptTime;
	}
	public void setDeptTime(String deptTime) {
		this.deptTime = deptTime;
	}
	public String getArrTime() {
		return arrTime;
	}
	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	
	
	
}

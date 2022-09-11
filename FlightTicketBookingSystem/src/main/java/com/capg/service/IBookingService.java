package com.capg.service;

import java.util.List;

import com.capg.entities.*;


public interface IBookingService {
	public List<Booking> getBooking();
	public Booking getBookingById(int employeeId);
	public Booking addBooking(Booking employee);
	public Booking updateBooking(Booking employee);
	public void deleteBooking(int employeeId);
}

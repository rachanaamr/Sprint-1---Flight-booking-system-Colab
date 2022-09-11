package com.capg.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entities.*;



@Service
public class BookingServiceImpl implements IBookingService{
	List<Booking> list = new ArrayList<>(Arrays.asList(
			new Booking(101, "01-01-2022", "11-01-2022", 30000.0, 3),
			new Booking(102, "02-02-2022", "12-02-2022", 25000.0, 2),
			new Booking(103, "03-03-2022", "13-03-2022", 45000.0, 3)
			)); 
	
	@Override
	public List<Booking> getBooking(){
		return list;
	}
	
	@Override
	public Booking getBookingById(int bookingId) {
		Booking booking = null;
		for(Booking b : list) {
			if(b.getBookingId()==bookingId) {
				booking = b;
				break;
			}
		}
		return booking;
	}
	
	@Override
	public Booking addBooking(Booking booking) {
		this.list.add(booking);
		return booking;
	}
	
	@Override
	public Booking updateBooking(Booking booking) {
		this.list.forEach(b -> 
		{
			if(b.getBookingId()==booking.getBookingId()) {
				b.setBookingDate(booking.getBookingDate());
				b.setTravelDate(booking.getTravelDate());
				b.setTotalCost(booking.getTotalCost());
				b.setSeatsBooked(booking.getSeatsBooked());
			}
		});
		return booking;
	}

	@Override
	public void deleteBooking(int bookingId) {
		this.list = list.stream().filter(b->b.getBookingId()!=bookingId).collect(Collectors.toList());
	}
}

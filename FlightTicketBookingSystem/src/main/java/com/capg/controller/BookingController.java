package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.service.IBookingService;
import com.capg.entities.*;



@RestController
public class BookingController {
	@Autowired
	IBookingService service;
	
	@GetMapping("/booking")
	public List<Booking> getBooking(){
		return this.service.getBooking();
	}
	@GetMapping("/booking/{bookingId}")
	public Booking getEmployeeById(@PathVariable int bookingId) {
		return this.service.getBookingById(bookingId);
	}
	@PostMapping("/booking")
	public Booking addBooking(@RequestBody Booking booking) {
		return this.service.addBooking(booking);
	}
	@PutMapping("/booking")
	public Booking updateEmployee(@RequestBody Booking booking) {
		return this.service.updateBooking(booking);
	}
	@DeleteMapping("/booking/{bookingId}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable int bookingId) {
		try {
		this.service.deleteBooking(bookingId);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch(Exception ex) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
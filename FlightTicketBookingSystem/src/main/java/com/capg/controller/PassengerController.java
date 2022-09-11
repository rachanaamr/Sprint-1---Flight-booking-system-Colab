package com.capg.controller;

import java.util.List;

import javax.websocket.server.PathParam;

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

import com.capg.entities.Passenger;
import com.capg.service.IPassengerService;

@RestController
public class PassengerController {
	
	@Autowired
	IPassengerService service;
	
	@GetMapping("/passengers")
	public List<Passenger> getPassengers()
	{
		System.out.println("Passengers list");
		return this.service.getPassengers();
	}
	
	@GetMapping("/passenger/{passengerId}")
	public Passenger getPassengerById(@PathVariable int passengerId)
	{
		System.out.println("get passenger by ID");
		return this.service.getPassengerById(passengerId);
	}
	
	@PostMapping("/passenger")
	public Passenger addPassenger(@RequestBody Passenger passenger)
	{
		System.out.println("Adding passenger");
		return this.service.addPassenger(passenger);
	}
	
	@PutMapping("/passenger")
	public Passenger updaPassenger(@RequestBody Passenger passenger)
	{
		System.out.println("Update passenger");
		return this.service.updatePassenger(passenger);
	}
	
	@DeleteMapping("/passenger/{passengerId}")
	public void deletePassenger(@PathVariable int passengerId)
	{
		System.out.println("Delete passenger");
		this.service.deletePassenger(passengerId);
	}

}

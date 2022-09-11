package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entity.Flight;
import com.capg.service.IFlightService;

@RestController
@RequestMapping("/flight")
public class FlightController {
	
	@Autowired
	IFlightService flightService;
	
	@GetMapping("/flights")
	public List<Flight> getFlightDetails(){
		return this.flightService.getFlightDetails();		
	}
	
	@GetMapping("/flights/{flightid}")
	public Flight getFlightDetailsById(@PathVariable("flightid") int flightid){
		return this.flightService.getFlightDetailsById(flightid);		
	}
	
	@PostMapping("/flights")
	public Flight addFlightDetails(@RequestBody Flight flight) {
		return this.flightService.addFlight(flight);
	}
	
	@PutMapping("/flights")
	public Flight updateFlightDetails(@RequestBody Flight flight) {
		return this.flightService.updateFlight(flight);
	}
	
	@DeleteMapping("/flights/{flightid}")
	public void deleteFlightDetails(@PathVariable("flightid") int flightid) {
		this.flightService.deleteFlight(flightid);
	}
}

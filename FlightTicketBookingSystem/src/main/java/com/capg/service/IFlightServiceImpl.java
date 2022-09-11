package com.capg.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.capg.entity.Flight;

public class IFlightServiceImpl implements IFlightService {
	
	List<Flight> list = new ArrayList<>(Arrays.asList(
			new Flight(1, "Bengaluru", "Goa", "05:00", "8:00", "01-02-22", 1550, 3, 90),
			new Flight(2, "Chennai", "Hyderabad", "19:00", "23:00", "10-09-22", 2550, 4, 120),
			new Flight(3, "Mumbai", "Gandhinagar", "09:00", "14:00", "19-05-22", 4500, 5, 50)
			)); 
	
	@Override
	public List<Flight> getFlightDetails(){
		return list;
	}
	
	@Override
	public Flight getFlightDetailsById(int flightId) {
		Flight flight = null;
		for(Flight f : list) {
			if(f.getFlightId()==flightId) {
				flight = f;
				break;
			}
		}
		return flight;
	}
	
	@Override
	public Flight addFlight(Flight flight) {
		this.list.add(flight);
		return flight;
	}
	
	@Override
	public Flight updateFlight(Flight flight) {
		this.list.forEach(f -> 
		{
			if(f.getFlightId()==flight.getFlightId()) {
				f.setArrivalTime(flight.getArrivalTime());
				f.setAvailableSeats(flight.getAvailableSeats());
				f.setDate(flight.getDate());
				f.setDepartureTime(flight.getDepartureTime());
				f.setDestinationLocation(flight.getDestinationLocation());
				f.setDuration(flight.getDuration());
				f.setFare(flight.getFare());
				f.setSourceLocation(flight.getSourceLocation());
			}
		});
		return flight;
	}

	@Override
	public void deleteFlight(int flightId) {
		this.list = list.stream().filter(f->f.getFlightId()!=flightId).collect(Collectors.toList());
	}
}

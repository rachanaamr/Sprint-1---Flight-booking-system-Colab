package com.capg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.entities.Flight;

public interface IFlightDAO extends JpaRepository<Flight, Integer>{

}

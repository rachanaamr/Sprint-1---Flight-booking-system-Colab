package com.capg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.entities.Passenger;

public interface IPassengerDAO extends JpaRepository<Passenger, Integer>{

}

package com.capg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.entities.Booking;

public interface IBookingDAO extends JpaRepository<Booking, Integer>{

}

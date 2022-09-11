package com.capg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.entities.User;

public interface IUserDao extends JpaRepository<User, Integer>{

}

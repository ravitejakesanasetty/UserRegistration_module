package com.sp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

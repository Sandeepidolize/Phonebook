package com.ashokit.userRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.UserRegisterEntity;

public interface UserRepository extends JpaRepository<UserRegisterEntity, Long> {
	 
}
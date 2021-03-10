package com.ashokit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ashokit.entity.UserRegisterEntity;

public class RegisterDao {

	@Autowired UserRegisterEntity userRegisterEntity;
	
	 public boolean saveUserRegister(UserRegisterEntity userRegisterEntity) {
		return false;
	}
	 
	 public List<UserRegisterEntity> getCountry() {
		return null;
	} 
	 
	 public List<UserRegisterEntity> getState() {
			return null;
		} 
	 
	 public List<UserRegisterEntity> getCity() {
			return null;
		}
}

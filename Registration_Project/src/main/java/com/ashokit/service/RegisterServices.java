package com.ashokit.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service  
public class RegisterServices {

	public boolean  UserRegister()  
	{
		return false;  
	
	} 
	
	public boolean chakemailexist(String email) {
		return true;
		
	}
	public  Map<Integer,String> getAllCountry() {
		return null;
	}
	
	public  Map<Integer,String> getAllState(Integer stateid) {
		return null;
	}
	
	public  Map<Integer,String> getAllCity(Integer countryId) {
		return null;
	}
	public boolean isTempPsw(String email) {
		return false;
		
	}
	public boolean unlockAccount(String email) {
		return false;
		
	}
	public String loginCheck(String emial,String psw) {
		
		return }
}

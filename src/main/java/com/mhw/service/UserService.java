package com.mhw.service;

import java.util.List;

import com.mhw.pojo.Userinfo;

public interface UserService {
	
	public void findUserById(Integer id);
	
	public Userinfo findByName(String name);
	
	public List<Userinfo> findAll();
	
	public void addUser(Userinfo userinfo);
}

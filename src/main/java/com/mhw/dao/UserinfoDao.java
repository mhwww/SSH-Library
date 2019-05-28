package com.mhw.dao;

import java.util.List;

import com.mhw.pojo.Userinfo;

public interface UserinfoDao {
	
	public Userinfo findById(Integer id);
	
	public List<Userinfo> findByName(String name);
	
	public List<Userinfo> findAll();
	
	public void addUser(Userinfo userinfo);
}

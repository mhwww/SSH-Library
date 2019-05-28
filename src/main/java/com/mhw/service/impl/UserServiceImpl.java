package com.mhw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mhw.dao.UserinfoDao;
import com.mhw.dao.UserinfoDaoImpl;
import com.mhw.pojo.Userinfo;
import com.mhw.service.UserService;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserinfoDao userinfoDao;

	public void findUserById(Integer id) {
		Userinfo userinfo = new Userinfo();
		userinfo = userinfoDao.findById(id);
	}

	public Userinfo findByName(String name) {
		Userinfo userinfo = new Userinfo();
		List<Userinfo> list = userinfoDao.findByName(name);
		for (Userinfo u : list) {
			userinfo = u;
		}
		return userinfo;
	}
	
	public List<Userinfo> findAll() {
		List<Userinfo> list = userinfoDao.findAll();
		return list;
	}

	public void addUser(Userinfo userinfo) {
		userinfoDao.addUser(userinfo);
	}

	

}

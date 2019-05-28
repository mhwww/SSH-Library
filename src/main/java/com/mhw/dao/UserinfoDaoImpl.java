package com.mhw.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.mhw.pojo.Userinfo;

@SuppressWarnings("deprecation")
public class UserinfoDaoImpl implements UserinfoDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//通过ID查询user用户信息
	public Userinfo findById(Integer id) {
		
		return hibernateTemplate.get(Userinfo.class, id);
	}

	//通过username查询用户信息
	public List<Userinfo> findByName(String name) {
		String hql = "from Userinfo where username = ?";
		return (List<Userinfo>) hibernateTemplate.find(hql, name);
	}

	//查询所有用户信息
	public List<Userinfo> findAll() {
		
		return (List<Userinfo>) hibernateTemplate.find("from Userinfo");
	}

	//增加用户
	public void addUser(Userinfo userinfo) {
		
		hibernateTemplate.save(userinfo);	
	}
	
	
	
	//最基础的操作数据库方式
	
//	//通过ID查询user用户信息
//	public Userinfo findById(Integer id) {
//		Session session = HibernateUtils.getSession();
//		Transaction transaction = session.beginTransaction();
//		Userinfo userifo = (Userinfo) session.get(Userinfo.class, id);
//		transaction.commit();
//		session.close();
//		return userifo;
//	}
//	
//	//通过username查询用户信息
//	public List<Userinfo> findByName(String name) {
//		Session session = HibernateUtils.getSession();
//		Transaction transaction = session.beginTransaction();
//		String hql = "from Userinfo where username = :username";
//		Query query = session.createQuery(hql);
//		query.setString("username", name);
//		List<Userinfo> list = query.list();
//		transaction.commit();
//		session.close();
//		return list;
//	}
//	
//	//查询所有用户信息
//	public List<Userinfo> findAll() {
//		Session session = HibernateUtils.getSession();
//		Transaction transaction = session.beginTransaction();
//		String hql = "from Userinfo";
//		Query query = session.createQuery(hql);
//		List<Userinfo> list = query.list();
//		transaction.commit();
//		session.close();
//		return list;
//	}
//
//	public void addUser(Userinfo userinfo) {
//		Session session = HibernateUtils.getSession();
//		Transaction transaction = session.beginTransaction();
//		session.save(userinfo);
//		transaction.commit();
//		session.close();
//	}
	
}

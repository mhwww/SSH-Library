package test;

import java.util.List;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mhw.dao.UserinfoDao;
import com.mhw.dao.UserinfoDaoImpl;
import com.mhw.pojo.Userinfo;
import com.mhw.service.UserService;
import com.mhw.service.impl.UserServiceImpl;

public class test {
	
	@Test
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) ac.getBean("userService");
		Userinfo userinfo = userService.findByName("admin");
		System.out.println(userinfo);
		userinfo.setUsername("123");
		userinfo.setPwd("123");
		userService.addUser(userinfo);
		List<Userinfo> list = userService.findAll();
		for (Userinfo u : list) {
			System.out.println(u);
		}
	}
}

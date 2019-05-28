package com.mhw.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.mhw.pojo.Userinfo;
import com.mhw.service.UserService;
import com.mhw.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	private static final long serialVersionUID = -537283500691577381L;
	
	private HttpServletRequest request = ServletActionContext.getRequest();
	@Autowired
	private UserService userService;
	
	public String login() {
		String username = request.getParameter("username1");
		String pwd = request.getParameter("pwd1");
		Userinfo userinfo = userService.findByName(username);
		if(pwd.equals(userinfo.getPwd())){
			return SUCCESS;
		}else {
			return ERROR;
		}	
	}
	public String register() {
		//获取表单的value
		String username = request.getParameter("username2");
		String pwd = request.getParameter("pwd2");
		//查询所有用户信息，验证是否用户存在
		List<Userinfo> list = userService.findAll();
		if(list != null) {//用户为空时可以直接跳过验证
			for (Userinfo userinfo : list) {
				if(username.equals(userinfo.getUsername())) {
					return ERROR;
				}
			}
		}
		//调用对应方法存入数据库
		Userinfo userinfo = new Userinfo();
		userinfo.setUsername(username);
		userinfo.setPwd(pwd);
		userService.addUser(userinfo);
		return SUCCESS;
	}
	
}

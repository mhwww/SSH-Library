package com.mhw.pojo;

import java.io.Serializable;

public class Userinfo implements Serializable {
	private static final long serialVersionUID = -8726082489074765709L;
	private Integer id;
	private String username;
	private String pwd;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Userifo [id=" + id + ", username=" + username + ", pwd=" + pwd + "]";
	}
	
}

package com.qiantai_business.po;

public class UserPo {
	
	private Integer user_id;
	private String user_name;
	private String password;
	private Integer user_class;//用户级别，0普通，1管理员
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Integer getUser_class() {
		return user_class;
	}
	public void setUser_class(Integer user_class) {
		this.user_class = user_class;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	
	

}

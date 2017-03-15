package com.pro.domain;

public class AdminUser {
	private int id;
	private Powers powers;
	private String admin_name;
	private String admin_acc;
	private String password;
	
	
	
	public AdminUser() {
		super();
	}
	
	
	public AdminUser(String admin_acc, String password) {
		super();
		this.admin_acc = admin_acc;
		this.password = password;
	}


	public AdminUser(int id, Powers powers, String admin_name,
			String admin_acc, String password) {
		super();
		this.id = id;
		this.powers = powers;
		this.admin_name = admin_name;
		this.admin_acc = admin_acc;
		this.password = password;
	}


	public Powers getPowers() {
		return powers;
	}


	public void setPowers(Powers powers) {
		this.powers = powers;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_acc() {
		return admin_acc;
	}
	public void setAdmin_acc(String admin_acc) {
		this.admin_acc = admin_acc;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "AdminUser [id=" + id + ", powers=" + powers + ", admin_name="
				+ admin_name + ", admin_acc=" + admin_acc + ", password="
				+ password + "]";
	}
	
	
}

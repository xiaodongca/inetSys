package com.pro.domain;

public class Finance {

	private int id;
	private String type;
	private String money;
	private String event;
	private String e_time;
	private String af_time;
	private String admin_name;
	
	public Finance(int id, String type, String money, String event,
			String e_time, String af_time, String admin_name) {
		super();
		this.id = id;
		this.type = type;
		this.money = money;
		this.event = event;
		this.e_time = e_time;
		this.af_time = af_time;
		this.admin_name = admin_name;
	}
	
	public Finance(String type, String money, String event, String e_time,
			String af_time, String admin_name) {
		super();
		this.type = type;
		this.money = money;
		this.event = event;
		this.e_time = e_time;
		this.af_time = af_time;
		this.admin_name = admin_name;
	}

	public Finance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getE_time() {
		return e_time;
	}
	public void setE_time(String e_time) {
		this.e_time = e_time;
	}
	public String getAf_time() {
		return af_time;
	}
	public void setAf_time(String af_time) {
		this.af_time = af_time;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	
	
}

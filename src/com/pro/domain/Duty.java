package com.pro.domain;

public class Duty {

	private int d_id;
	private AssPerson assPerson;
	private String d_time;
	private String d_address;
	private String andmin_name;
	
	public Duty() {
		super();
	}
	
	public Duty(AssPerson assPerson, String d_time, String d_address,
			String andmin_name) {
		super();
		this.assPerson = assPerson;
		this.d_time = d_time;
		this.d_address = d_address;
		this.andmin_name = andmin_name;
	}

	public Duty(int d_id, AssPerson assPerson, String d_time, String d_address,
			String andmin_name) {
		super();
		this.d_id = d_id;
		this.assPerson = assPerson;
		this.d_time = d_time;
		this.d_address = d_address;
		this.andmin_name = andmin_name;
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public AssPerson getAssPerson() {
		return assPerson;
	}
	public void setAssPerson(AssPerson assPerson) {
		this.assPerson = assPerson;
	}
	public String getD_time() {
		return d_time;
	}
	public void setD_time(String d_time) {
		this.d_time = d_time;
	}
	public String getD_address() {
		return d_address;
	}
	public void setD_address(String d_address) {
		this.d_address = d_address;
	}
	public String getAndmin_name() {
		return andmin_name;
	}
	public void setAndmin_name(String andmin_name) {
		this.andmin_name = andmin_name;
	}
	
	
}

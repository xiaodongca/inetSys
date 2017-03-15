package com.pro.domain;

public class Activity {

	private int a_id;
	private String a_name;
	private String a_content;
	private String credit;
	private String start_time;
	private String end_time;
	private String admin_name;
	
	public Activity() {
		super();
	}
	
	public Activity(String a_name, String a_content, String credit,
			String start_time, String end_time, String admin_name) {
		super();
		this.a_name = a_name;
		this.a_content = a_content;
		this.credit = credit;
		this.start_time = start_time;
		this.end_time = end_time;
		this.admin_name = admin_name;
	}

	public Activity(int a_id, String a_name, String a_content, String credit,
			String start_time, String end_time, String admin_name) {
		super();
		this.a_id = a_id;
		this.a_name = a_name;
		this.a_content = a_content;
		this.credit = credit;
		this.start_time = start_time;
		this.end_time = end_time;
		this.admin_name = admin_name;
	}
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	public String getA_content() {
		return a_content;
	}
	public void setA_content(String a_content) {
		this.a_content = a_content;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	
	
	
}

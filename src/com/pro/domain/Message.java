package com.pro.domain;

public class Message {
	
	private int l_id;
	private AssPerson assPerson;
	private String l_content;
	private String l_time;
	private String n_name;
	
	public Message() {
		super();
	}
	
	public Message(AssPerson assPerson, String l_content, String l_time,
			String n_name) {
		super();
		this.assPerson = assPerson;
		this.l_content = l_content;
		this.l_time = l_time;
		this.n_name = n_name;
	}

	public Message(int l_id, AssPerson assPerson, String l_content,
			String l_time, String n_name) {
		super();
		this.l_id = l_id;
		this.assPerson = assPerson;
		this.l_content = l_content;
		this.l_time = l_time;
		this.n_name = n_name;
	}
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public AssPerson getAssPerson() {
		return assPerson;
	}
	public void setAssPerson(AssPerson assPerson) {
		this.assPerson = assPerson;
	}
	public String getL_content() {
		return l_content;
	}
	public void setL_content(String l_content) {
		this.l_content = l_content;
	}
	public String getL_time() {
		return l_time;
	}
	public void setL_time(String l_time) {
		this.l_time = l_time;
	}
	public String getN_name() {
		return n_name;
	}
	public void setN_name(String n_name) {
		this.n_name = n_name;
	}
	
	
	
	
	
}

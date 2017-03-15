package com.pro.domain;

public class News {
	private int id;
	private String n_title;
	private String n_content;
	private String n_time;
	private String admin_name;

	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public News(String n_title, String n_content, String n_time,
			String admin_name) {
		super();
		this.n_title = n_title;
		this.n_content = n_content;
		this.n_time = n_time;
		this.admin_name = admin_name;
	}

	public News(int id, String n_title, String n_content, String n_time,
			String admin_name) {
		super();
		this.id = id;
		this.n_title = n_title;
		this.n_content = n_content;
		this.n_time = n_time;
		this.admin_name = admin_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getN_title() {
		return n_title;
	}

	public void setN_title(String n_title) {
		this.n_title = n_title;
	}

	public String getN_content() {
		return n_content;
	}

	public void setN_content(String n_content) {
		this.n_content = n_content;
	}

	public String getN_time() {
		return n_time;
	}

	public void setN_time(String n_time) {
		this.n_time = n_time;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
}

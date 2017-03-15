package com.pro.domain;

public class Goods {

	private int id;
	private String g_name;
	private String g_number;
	private String g_worth;
	private String remarks;
	
	
	
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Goods(String g_name, String g_number, String g_worth, String remarks) {
		super();
		this.g_name = g_name;
		this.g_number = g_number;
		this.g_worth = g_worth;
		this.remarks = remarks;
	}

	public Goods(int id, String g_name, String g_number, String g_worth,
			String remarks) {
		super();
		this.id = id;
		this.g_name = g_name;
		this.g_number = g_number;
		this.g_worth = g_worth;
		this.remarks = remarks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}
	public String getG_number() {
		return g_number;
	}
	public void setG_number(String g_number) {
		this.g_number = g_number;
	}
	public String getG_worth() {
		return g_worth;
	}
	public void setG_worth(String g_worth) {
		this.g_worth = g_worth;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}

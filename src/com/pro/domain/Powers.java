package com.pro.domain;

public class Powers {

	private int p_id;
	private String p_name;
	private String p_range;
	
	
	public Powers() {
		super();
	}

	public Powers(String p_name, String p_range) {
		super();
		this.p_name = p_name;
		this.p_range = p_range;
	}

	public Powers(int p_id, String p_name, String p_range) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_range = p_range;
	}
	
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_range() {
		return p_range;
	}
	public void setP_range(String p_range) {
		this.p_range = p_range;
	}

	
	
}

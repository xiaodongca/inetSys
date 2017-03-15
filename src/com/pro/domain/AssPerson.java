package com.pro.domain;

public class AssPerson {//社团人员类
	private int apf_id;
	private Powers powers;
	private String apf_name;
	private String apf_number;
	private String tdirrectin;
	private String password;
	private String credit;
	private String tel;
	private String email;
	private String qq;
	private int p_id;
	
	
	public int getP_id() {
		return p_id;
	}



	public void setP_id(int p_id) {
		this.p_id = p_id;
	}



	public AssPerson() {
		super();
	}
	
	

	public AssPerson(Powers powers, String apf_name, String apf_number,
			String tdirrectin, String password, String credit, String tel,
			String email, String qq) {
		super();
		this.powers = powers;
		this.apf_name = apf_name;
		this.apf_number = apf_number;
		this.tdirrectin = tdirrectin;
		this.password = password;
		this.credit = credit;
		this.tel = tel;
		this.email = email;
		this.qq = qq;
	}



	public AssPerson(int apf_id, Powers powers, String apf_name,
			String apf_number, String tdirrectin, String password,
			String credit, String tel, String email, String qq) {
		super();
		this.apf_id = apf_id;
		this.powers = powers;
		this.apf_name = apf_name;
		this.apf_number = apf_number;
		this.tdirrectin = tdirrectin;
		this.password = password;
		this.credit = credit;
		this.tel = tel;
		this.email = email;
		this.qq = qq;
	}



	public AssPerson(String apf_number, String password) {
		super();
		this.apf_number = apf_number;
		this.password = password;
	}


	public Powers getPowers() {
		return powers;
	}



	public void setPowers(Powers powers) {
		this.powers = powers;
	}



	public int getApf_id() {
		return apf_id;
	}

	public void setApf_id(int apf_id) {
		this.apf_id = apf_id;
	}


	public String getApf_name() {
		return apf_name;
	}

	public void setApf_name(String apf_name) {
		this.apf_name = apf_name;
	}

	public String getApf_number() {
		return apf_number;
	}

	public void setApf_number(String apf_number) {
		this.apf_number = apf_number;
	}

	public String getTdirrectin() {
		return tdirrectin;
	}

	public void setTdirrectin(String tdirrectin) {
		this.tdirrectin = tdirrectin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}



	@Override
	public String toString() {
		return "AssPerson [apf_id=" + apf_id + ", powers=" + powers
				+ ", apf_name=" + apf_name + ", apf_number=" + apf_number
				+ ", tdirrectin=" + tdirrectin + ", password=" + password
				+ ", credit=" + credit + ", tel=" + tel + ", email=" + email
				+ ", qq=" + qq + "]";
	}


	
	
	
	
	
}

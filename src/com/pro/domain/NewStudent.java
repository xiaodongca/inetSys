package com.pro.domain;

public class NewStudent {
	private int id;
	private String n_name;
	private String snumber;
	private String tdirection;
	private String tel;
	private String n_class;
	private String email;
	private String qq;
	private String hobby;
	private String specalty;
	
	public NewStudent() {
		super();
	}
	
	public NewStudent(String n_name, String snumber, String tdirection,
			String tel, String n_class, String email, String qq, String hobby,
			String specalty) {
		super();
		this.n_name = n_name;
		this.snumber = snumber;
		this.tdirection = tdirection;
		this.tel = tel;
		this.n_class = n_class;
		this.email = email;
		this.qq = qq;
		this.hobby = hobby;
		this.specalty = specalty;
	}

	public NewStudent(int id, String n_name, String snumber, String tdirection,
			String tel, String n_class, String email, String qq, String hobby,
			String specalty) {
		super();
		this.id = id;
		this.n_name = n_name;
		this.snumber = snumber;
		this.tdirection = tdirection;
		this.tel = tel;
		this.n_class = n_class;
		this.email = email;
		this.qq = qq;
		this.hobby = hobby;
		this.specalty = specalty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getN_name() {
		return n_name;
	}
	public void setN_name(String n_name) {
		this.n_name = n_name;
	}
	public String getSnumber() {
		return snumber;
	}
	public void setSnumber(String snumber) {
		this.snumber = snumber;
	}
	public String getTdirection() {
		return tdirection;
	}
	public void setTdirection(String tdirection) {
		this.tdirection = tdirection;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getN_class() {
		return n_class;
	}
	public void setN_class(String n_class) {
		this.n_class = n_class;
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
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getSpecalty() {
		return specalty;
	}
	public void setSpecalty(String specalty) {
		this.specalty = specalty;
	}
	
	
}

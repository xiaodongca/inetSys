package com.pro.domain;

public class ActPerson {

	private int id;
	private Activity activity;
	private AssPerson assPerson;
	
	
	public ActPerson() {
		super();
	}
	
	public ActPerson(Activity activity, AssPerson assPerson) {
		super();
		this.activity = activity;
		this.assPerson = assPerson;
	}

	public ActPerson(int id, Activity activity, AssPerson assPerson) {
		super();
		this.id = id;
		this.activity = activity;
		this.assPerson = assPerson;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Activity getActivity() {
		return activity;
	}


	public void setActivity(Activity activity) {
		this.activity = activity;
	}


	public AssPerson getAssPerson() {
		return assPerson;
	}


	public void setAssPerson(AssPerson assPerson) {
		this.assPerson = assPerson;
	}

	
	
	
}

package com.pro.service;

import java.util.List;

import com.pro.domain.Activity;

public interface ActivityService {
	public List<Activity>selectAll();
	public void add(Activity activity);
	public void modify(Activity activity);
	public Activity selectOne(int id);
	public void delete(int id);
}

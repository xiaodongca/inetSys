package com.pro.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pro.domain.Activity;
@Repository("activityDao")
public interface ActivityDao {
	public List<Activity> selectAll();
	public void add(Activity activity);
	public void modify(Activity activity);
	public Activity selectOne(int id);
	public void delete(int id);
}

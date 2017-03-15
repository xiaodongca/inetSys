package com.pro.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pro.dao.ActivityDao;
import com.pro.domain.Activity;
@Service("activityService")
public class ActivityServiceImpl implements ActivityService {

	@Resource(name ="activityDao")
	public ActivityDao activityDao;

	
	
	public List<Activity> selectAll() {
		return activityDao.selectAll();
	}

	public void add(Activity activity) {
		activityDao.add(activity);
	}

	public void modify(Activity activity) {
		activityDao.modify(activity);		
	}

	public Activity selectOne(int id) {
		return activityDao.selectOne(id);
	}

	public void delete(int id) {
		activityDao.delete(id);
	}

}

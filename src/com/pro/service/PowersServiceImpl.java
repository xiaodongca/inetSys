package com.pro.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pro.dao.PowersDao;
import com.pro.domain.Powers;

@Service("powersSerivce")
public class PowersServiceImpl implements PowersService{

	@Resource(name = "powersDao")
	public PowersDao powersDao;
	
	public Powers selectPowers(int id) {
		return powersDao.selectPowers(id);
	}

}

package com.pro.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pro.dao.DutyDao;
import com.pro.domain.Duty;
@Service("dutyService")
public class DutyServiceImpl implements DutyService {
	 
	@Resource(name="dutyDao")
	public DutyDao dutyDao;
	
	public List<Duty> selectAll() {
		return dutyDao.selectAll();
	}



	public void delete(int id) {
		dutyDao.delete(id);
	}



	public void add(Duty duty) {
		dutyDao.add(duty);
	}



	public void modify(Duty duty) {
		dutyDao.modify(duty);
	}



	public Duty selectOne(int id) {
		return dutyDao.selectOne(id);
	}

}

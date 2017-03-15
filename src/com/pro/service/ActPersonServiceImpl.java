package com.pro.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pro.dao.ActPersonDao;
import com.pro.domain.ActPerson;

@Service("actPersonService")
public class ActPersonServiceImpl implements ActPersonService {

	@Resource(name = "actPersonDao")
	public ActPersonDao actPersonDao;

	public List<ActPerson> selectAll() {
		return actPersonDao.selectAll();
	}
	
	public void add(ActPerson actPerson) {
		actPersonDao.add(actPerson);
	}

	public void modify(ActPerson actPerson) {
		actPersonDao.modify(actPerson);
	}

	public ActPerson selectOne(int id) {
		return actPersonDao.selectOne(id);
	}

	public void delete(int id) {
		actPersonDao.delete(id);
	}

}

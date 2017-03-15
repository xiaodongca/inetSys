package com.pro.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pro.dao.FinanceDao;
import com.pro.domain.Finance;

@Service("financeService")
public class FinanceServiceImpl implements FinanceService{

	@Resource(name ="financeDao")
	public FinanceDao financeDao;
	


	public void delete(int id) {
		financeDao.delete(id);
	}



	public List<Finance> selectAll() {
		// TODO Auto-generated method stub
		return financeDao.selectAll();
	}



	public void add(Finance news) {
		// TODO Auto-generated method stub
		financeDao.add(news);
	}



	public void modify(Finance news) {
		// TODO Auto-generated method stub
		financeDao.modify(news);
	}



	public Finance selectOne(int id) {
		// TODO Auto-generated method stub
		return financeDao.selectOne(id);
	}

}

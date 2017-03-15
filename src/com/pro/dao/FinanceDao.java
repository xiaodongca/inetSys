package com.pro.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pro.domain.Finance;
@Repository("financeDao")
public interface FinanceDao {
	public List<Finance> selectAll();
	public void add(Finance news);
	public void modify(Finance news);
	public Finance selectOne(int id);
	public void delete(int id);
}

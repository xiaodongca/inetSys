package com.pro.service;

import java.util.List;

import com.pro.domain.Finance;

public interface FinanceService {
	public List<Finance> selectAll();
	public void add(Finance news);
	public void modify(Finance news);
	public Finance selectOne(int id);
	public void delete(int id);
}

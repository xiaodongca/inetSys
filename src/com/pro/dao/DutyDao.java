package com.pro.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pro.domain.Duty;

@Repository("dutyDao")
public interface DutyDao {
	public List<Duty>selectAll();
	public void add(Duty duty);
	public void modify(Duty duty);
	public Duty selectOne(int id);
	public void delete(int id);
	
}

package com.pro.service;

import java.util.List;

import com.pro.domain.Duty;

public interface DutyService {
	public List<Duty>selectAll();
	public void add(Duty duty);
	public void modify(Duty duty);
	public Duty selectOne(int id);
	public void delete(int id);
}

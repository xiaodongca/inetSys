package com.pro.service;

import java.util.List;

import com.pro.domain.ActPerson;

public interface ActPersonService {
	public List<ActPerson> selectAll();
	public void add(ActPerson actPerson);
	public void modify(ActPerson actPerson);
	public ActPerson selectOne(int id);
	public void delete(int id);
}

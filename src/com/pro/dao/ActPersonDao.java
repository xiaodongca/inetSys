package com.pro.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pro.domain.ActPerson;
@Repository("actPersonDao")
public interface ActPersonDao {
	public List<ActPerson> selectAll();
	public void add(ActPerson actPerson);
	public void modify(ActPerson actPerson);
	public ActPerson selectOne(int id);
	public void delete(int id);
}

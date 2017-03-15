package com.pro.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pro.domain.AssPerson;

@Repository("assPersonDao")
public interface AssPersonDao {
	public AssPerson login(AssPerson assPerson);
	public List<AssPerson>selectAll();
	public void add(AssPerson assPerson);
	public void modify(AssPerson assPerson);
	public AssPerson selectOne(int id);
	public void upPassword(AssPerson assPerson);
	public void delete(int id);
	public ArrayList<AssPerson> selectPage(int no1,int no2);
	public int counts();
}

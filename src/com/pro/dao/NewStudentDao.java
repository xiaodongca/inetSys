package com.pro.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pro.domain.NewStudent;

@Repository("newStudentDao")
public interface NewStudentDao {
	public List<NewStudent> selectAll();
	public void add(NewStudent newStudent);
	public void modify(NewStudent newStudent);
	public NewStudent selectOne(int id);
	public void delete(int id);
	public ArrayList<NewStudent> selectPage(int no1,int no2);
	public int counts();
}

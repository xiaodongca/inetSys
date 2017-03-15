package com.pro.service;

import java.util.List;

import com.pro.domain.NewStudent;
import com.pro.util.PageModel;

public interface NewStudentService {
	public List<NewStudent> selectAll();
	public void add(NewStudent newStudent);
	public void modify(NewStudent newStudent);
	public NewStudent selectOne(int id);
	public void delete(int id);
	public PageModel<NewStudent> selectPageModel(int pagesize,int currentpage);
}

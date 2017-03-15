package com.pro.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pro.dao.NewStudentDao;
import com.pro.domain.NewStudent;
import com.pro.util.PageModel;

@Service("newStudentService")
public class NewStudentServiceImpl implements NewStudentService{

	@Resource(name ="newStudentDao")
	public NewStudentDao newStudentDao;

	public List<NewStudent> selectAll() {
		return newStudentDao.selectAll();
	}

	public void add(NewStudent newStudent) {
		newStudentDao.add(newStudent);
	}

	public void modify(NewStudent newStudent) {
		newStudentDao.modify(newStudent);
	}

	public NewStudent selectOne(int id) {
		return newStudentDao.selectOne(id);
	}

	public void delete(int id) {
		newStudentDao.delete(id);
	}

	public PageModel<NewStudent> selectPageModel(int pagesize, int currentpage) {
		ArrayList<NewStudent> list = null;
		int no1 = 0;
		int no2 = 0;
		int count = 0;
		no1=(currentpage-1)* pagesize+1;
		no2 = currentpage*pagesize;
		list = newStudentDao.selectPage(no1, no2);
		count = newStudentDao.counts();
		PageModel<NewStudent> model = new PageModel<NewStudent>();
		model.setArrayList(list);
		model.setTotalRecord(count);
		model.setPagesize(pagesize);
		model.setCurrentpage(currentpage);
		return model;
	}
	


}

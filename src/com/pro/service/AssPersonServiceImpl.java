package com.pro.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pro.dao.AssPersonDao;
import com.pro.domain.AssPerson;
import com.pro.util.PageModel;

@Service("assPersonService")
public class AssPersonServiceImpl implements AssPersonService{

	@Resource(name = "assPersonDao")
	public AssPersonDao assPersonDao;
	
	public AssPerson login(AssPerson assPerson) {
		System.out.println("学生登录3");
		return assPersonDao.login(assPerson);
	}

	public List<AssPerson> selectAll() {
		return assPersonDao.selectAll();
	}

	public void add(AssPerson assPerson) {
		assPersonDao.add(assPerson);
	}

	public void modify(AssPerson assPerson) {
		assPersonDao.modify(assPerson);
	}
	public void upPassword(AssPerson assPerson) {
		assPersonDao.upPassword(assPerson);
	}

	public AssPerson selectOne(int id) {
		return assPersonDao.selectOne(id);
	}

	public void delete(int id) {
		assPersonDao.delete(id);
	}

	public PageModel<AssPerson> selectPageModel(int pagesize, int currentpage) {
		ArrayList<AssPerson> list = null;
		int no1 = 0;
		int no2 = 0;
		int count = 0;
		no1=(currentpage-1)* pagesize+1;
		no2 = currentpage*pagesize;
		list = assPersonDao.selectPage(no1, no2);
		count = assPersonDao.counts();
		PageModel<AssPerson> model = new PageModel<AssPerson>();
		model.setArrayList(list);
		model.setTotalRecord(count);
		model.setPagesize(pagesize);
		model.setCurrentpage(currentpage);
		return model;
	}

	

}

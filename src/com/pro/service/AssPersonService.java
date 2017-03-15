package com.pro.service;

import java.util.List;

import com.pro.domain.AssPerson;
import com.pro.util.PageModel;

public interface AssPersonService {
	public AssPerson login(AssPerson assPerson);
	public List<AssPerson>selectAll();
	public void add(AssPerson assPerson);
	public void modify(AssPerson assPerson);
	public AssPerson selectOne(int id);
	public void delete(int id);
	public void upPassword(AssPerson assPerson);
	public PageModel<AssPerson> selectPageModel(int pagesize,int currentpage);
	
}

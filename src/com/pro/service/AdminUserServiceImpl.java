package com.pro.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pro.dao.AdminUserDao;
import com.pro.domain.AdminUser;

@Service("adminUserService")
public class AdminUserServiceImpl implements AdminUserService {

	@Resource(name = "adminUserDao")
	public AdminUserDao adminUserDao;

	public AdminUser login(AdminUser adminUser) {
		return adminUserDao.login(adminUser);
	}

	public List<AdminUser> selectAll() {
		return adminUserDao.selectAll();
	}

	public void add(AdminUser adminUser) {
		adminUserDao.add(adminUser);
	}

	public void modify(AdminUser adminUser) {
		adminUserDao.modify(adminUser);
	}

	public AdminUser selectOne(int id) {
		return adminUserDao.selectOne(id);
	}

	public void delete(int id) {
		adminUserDao.delete(id);
	}

}

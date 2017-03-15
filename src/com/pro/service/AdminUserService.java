package com.pro.service;

import java.util.List;

import com.pro.domain.AdminUser;

public interface AdminUserService {
	public AdminUser login(AdminUser adminUser);
	public List<AdminUser>selectAll();
	public void add(AdminUser adminUser);
	public void modify(AdminUser adminUser);
	public AdminUser selectOne(int id);
	public void delete(int id);
}

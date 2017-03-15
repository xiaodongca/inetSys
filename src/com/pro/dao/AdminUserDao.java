package com.pro.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pro.domain.AdminUser;

@Repository("adminUserDao")
public interface AdminUserDao {
	public AdminUser login(AdminUser adminUser);
	public List<AdminUser>selectAll();
	public void add(AdminUser adminUser);
	public void modify(AdminUser adminUser);
	public AdminUser selectOne(int id);
	public void delete(int id);
}

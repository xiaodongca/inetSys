package com.pro.dao;

import org.springframework.stereotype.Repository;

import com.pro.domain.Powers;

@Repository("powersDao")
public interface PowersDao {

	public Powers selectPowers(int id);
}

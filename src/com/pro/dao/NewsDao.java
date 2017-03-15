package com.pro.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pro.domain.News;

@Repository("newsDao")
public interface NewsDao {
	public List<News> selectAll();
	public void add(News news);
	public void modify(News news);
	public News selectOne(int id);
	public void delete(int id);
}

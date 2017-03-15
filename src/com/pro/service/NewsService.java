package com.pro.service;

import java.util.List;

import com.pro.domain.News;

public interface NewsService {
	public List<News> selectAll();
	public void add(News news);
	public void modify(News news);
	public News selectOne(int id);
	public void delete(int id);
}

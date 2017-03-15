package com.pro.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pro.dao.NewsDao;
import com.pro.domain.News;
@Service("newsService")
public class NewsServiceImpl implements NewsService{

	@Resource(name="newsDao")
	public NewsDao newsDao;
	
	public List<News> selectAll() {
		return newsDao.selectAll();
	}

	public void add(News news) {
		newsDao.add(news);
	}
	
	public void modify(News news) {
		newsDao.modify(news);
	}

	public News selectOne(int id) {
		return newsDao.selectOne(id);
	}

	public void delete(int id) {
		newsDao.delete(id);
	}

}

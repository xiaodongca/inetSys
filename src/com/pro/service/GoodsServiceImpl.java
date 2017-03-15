package com.pro.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pro.dao.GoodsDao;
import com.pro.domain.Goods;
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService{

	@Resource(name ="goodsDao")
	public GoodsDao goodsDao;
	
	public void delete(int id) {
		goodsDao.delete(id);
	}

	public List<Goods> selectAll() {
		return goodsDao.selectAll();
	}

	public void add(Goods goods) {
		goodsDao.add(goods);
	}

	public void modify(Goods goods) {
		goodsDao.modify(goods);
	}

	public Goods selectOne(int id) {
		return goodsDao.selectOne(id);
	}

}

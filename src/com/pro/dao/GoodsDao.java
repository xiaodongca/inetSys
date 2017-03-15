package com.pro.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pro.domain.Goods;

@Repository("goodsDao")
public interface GoodsDao {
	public List<Goods> selectAll();
	public void add(Goods goods);
	public void modify(Goods goods);
	public Goods selectOne(int id);
	public void delete(int id);
}

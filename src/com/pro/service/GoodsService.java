package com.pro.service;

import java.util.List;

import com.pro.domain.Goods;

public interface GoodsService {
	public List<Goods> selectAll();
	public void add(Goods goods);
	public void modify(Goods goods);
	public Goods selectOne(int id);
	public void delete(int id);
}

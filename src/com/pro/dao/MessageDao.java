package com.pro.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pro.domain.Message;
@Repository("messageDao")
public interface MessageDao {
	public List<Message>selectAll();
	public void add(Message message);
	public void modify(Message message);
	public Message selectOne(int id);
	public void delete(int id);
}

package com.pro.service;

import java.util.List;

import com.pro.domain.Message;

public interface MessageService {
	public List<Message>selectAll();
	public void add(Message message);
	public void modify(Message message);
	public Message selectOne(int id);
	public void delete(int id);
}

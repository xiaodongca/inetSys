package com.pro.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pro.dao.MessageDao;
import com.pro.domain.Message;

@Service("messageService")
public class MessageServiceImpl implements MessageService {

	@Resource(name ="messageDao")
	public MessageDao messageDao;
	
	public List<Message> selectAll() {
		return messageDao.selectAll();
	}

	public void add(Message message) {
		messageDao.add(message);
	}

	public void modify(Message message) {
		messageDao.modify(message);
	}

	public Message selectOne(int id) {
		return messageDao.selectOne(id);
	}

	public void delete(int id) {
		messageDao.delete(id);
	}

}

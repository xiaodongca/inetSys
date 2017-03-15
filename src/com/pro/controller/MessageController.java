package com.pro.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.domain.Message;
import com.pro.service.MessageService;

@Controller
@RequestMapping("/message")
public class MessageController {
	@Resource(name = "messageService")
	private MessageService messageService;;

	@RequestMapping("/toList")
	public ModelAndView toList(HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.addObject("MessageUserList", messageService.selectAll());
		mav.setViewName("message/message");

		return mav;
	}

	@RequestMapping("/toForm")
	public ModelAndView toForm(
			@RequestParam(value = "Id", required = false) String Id) {
		ModelAndView mav = new ModelAndView();

		if (Id != null) {
			mav.addObject("message",
					messageService.selectOne(Integer.parseInt(Id)));
			mav.setViewName("message/upMessage");
		} else {
			mav.setViewName("message/addMessage");
		}
		return mav;
	}

	@RequestMapping("/add")
	public String add(Message message) {
		messageService.add(message);
		return "redirect:/message/toList";
	}
	
	@RequestMapping("/addPerson")
	public ModelAndView addPerson(Message message) {
		messageService.add(message);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("welcome");
		return mav;
	}

	@RequestMapping("/up")
	public String up(Message message) {
		messageService.modify(message);
		return "redirect:/message/toList";

	}

	@RequestMapping("/delete")
	public String delete(String Id) {
		messageService.delete(Integer.parseInt(Id));
		return "redirect:/message/toList";
	}
}

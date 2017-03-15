package com.pro.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.domain.News;
import com.pro.service.NewsService;

@Controller
@RequestMapping("news")
public class NewsController {
	@Resource(name = "newsService")
	private NewsService newsService;

	@RequestMapping("/toList")
	public ModelAndView toList(HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.addObject("newsList", newsService.selectAll());
		mav.setViewName("news/news");

		return mav;
	}

	@RequestMapping("/toForm")
	public ModelAndView toForm(
			@RequestParam(value = "Id", required = false) String Id) {
		ModelAndView mav = new ModelAndView();

		if (Id != null) {
			mav.addObject("news",
					newsService.selectOne(Integer.parseInt(Id)));
			mav.setViewName("news/upNews");
		} else {
			mav.setViewName("news/addNews");
		}
		return mav;
	}

	@RequestMapping("/add")
	public String add(News news) {
		newsService.add(news);
		System.out.println("11111111");
		return "redirect:/news/toList";
	}

	@RequestMapping("/up")
	public String up(News news) {
		newsService.modify(news);
		return "redirect:/news/toList";

	}

	@RequestMapping("/delete")
	public String delete(String Id) {
		newsService.delete(Integer.parseInt(Id));
		return "redirect:/news/toList";
	}
}

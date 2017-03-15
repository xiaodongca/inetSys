package com.pro.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.domain.Goods;
import com.pro.service.GoodsService;
@Controller
@RequestMapping("/goods")
public class GoodsController {
	@Resource(name = "goodsService")
	private GoodsService goodsService;

	@RequestMapping("/toList")
	public ModelAndView toList(HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.addObject("goodsList", goodsService.selectAll());
		mav.setViewName("goods/goods");

		return mav;
	}

	@RequestMapping("/toForm")
	public ModelAndView toForm(
			@RequestParam(value = "Id", required = false) String Id) {
		ModelAndView mav = new ModelAndView();

		if (Id != null) {
			mav.addObject("goods",
					goodsService.selectOne(Integer.parseInt(Id)));
			mav.setViewName("goods/upGoods");
		} else {
			mav.setViewName("goods/addGoods");
		}
		return mav;
	}

	@RequestMapping("/add")
	public String add(Goods goods) {
		goodsService.add(goods);
		return "redirect:/goods/toList";
	}

	@RequestMapping("up")
	public String up(Goods goods) {
		goodsService.modify(goods);
		return "redirect:/goods/toList";
	}

	@RequestMapping("delete")
	public String delete(String Id) {
		return "redirect:/goods/toList";
	}
	
}

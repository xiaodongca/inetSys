package com.pro.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.domain.Finance;
import com.pro.service.FinanceService;

@Controller
@RequestMapping("finance")
public class FinanceController {
	@Resource(name = "financeService")
	private FinanceService financeService;

	@RequestMapping("/toList")
	public ModelAndView toList(HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.addObject("financeList", financeService.selectAll());
		mav.setViewName("finance/finance");

		return mav;
	}

	@RequestMapping("/toForm")
	public ModelAndView toForm(
			@RequestParam(value = "Id", required = false) String Id) {
		ModelAndView mav = new ModelAndView();

		if (Id != null) {
			mav.addObject("finance",
					financeService.selectOne(Integer.parseInt(Id)));
			mav.setViewName("finance/upFinance");
		} else {
			mav.setViewName("finance/addFinance");
		}
		return mav;
	}

	@RequestMapping("/add")
	public String add(Finance finance) {
		financeService.add(finance);
		return "redirect:/finance/toList";
	}

	@RequestMapping("up")
	public String up(Finance finance) {
		financeService.modify(finance);
		return "redirect:/finance/toList";

	}

	@RequestMapping("delete")
	public String delete(String Id) {
		return "redirect:/finance/toList";
	}
}

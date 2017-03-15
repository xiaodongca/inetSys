package com.pro.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.domain.Duty;
import com.pro.service.DutyService;

@Controller
@RequestMapping("/duty")
public class DutyController {
	@Resource(name = "dutyService")
	private DutyService dutyService;

	@RequestMapping("/toList")
	public ModelAndView toList(HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.addObject("dutyList", dutyService.selectAll());
		mav.setViewName("duty/duty");

		return mav;
	}

	@RequestMapping("/toForm")
	public ModelAndView toForm(
			@RequestParam(value = "Id", required = false) String Id) {
		ModelAndView mav = new ModelAndView();

		if (Id != null) {
			mav.addObject("duty", dutyService.selectOne(Integer.parseInt(Id)));
			mav.setViewName("duty/upDuty");
		} else {
			mav.setViewName("duty/addDuty");
		}
		return mav;
	}

	@RequestMapping("/add")
	public String add(Duty duty) {
		dutyService.add(duty);
		return "redirect:/duty/toList";
	}
	@RequestMapping("/toSelect")
	public ModelAndView toSelect
			(@RequestParam(value = "Id", required = false) String Id) {
		ModelAndView mav = new ModelAndView();
		System.out.println("值班iD"+Id);
		mav.addObject("duty", dutyService.selectOne(Integer.parseInt(Id)));
		mav.setViewName("duty/toSelect");
		return mav;
	}

	@RequestMapping("/up")
	public String up(Duty duty) {
		dutyService.modify(duty);
		return "redirect:/duty/toList";

	}

	@RequestMapping("/delete")
	public String delete(String Id) {
		dutyService.delete(Integer.parseInt(Id));
		return "redirect:/duty/toList";
	}
}

package com.pro.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.domain.ActPerson;
import com.pro.domain.Activity;
import com.pro.domain.AssPerson;
import com.pro.service.ActPersonService;

@Controller
@RequestMapping("actPerson")
public class ActPersonController {

	@Resource(name = "actPersonService")
	private ActPersonService actPersonService;

	@RequestMapping("/toList")
	public ModelAndView toList(HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.addObject("actPersonList", actPersonService.selectAll());
		mav.setViewName("actPerson/actPerson");
		return mav;
	}

	@RequestMapping("/toForm")
	public ModelAndView toForm(
			@RequestParam(value = "Id", required = false) String Id) {
		ModelAndView mav = new ModelAndView();

		if (Id != null) {
			mav.addObject("actPerson",
					actPersonService.selectOne(Integer.parseInt(Id)));
			mav.setViewName("actPerson/upActPerson");
		} else {
			mav.setViewName("actPerson/addActPerson");
		}
		return mav;
	}

	@RequestMapping("/addPerson")
	public ModelAndView addPerson(
			@RequestParam(value = "a_id", required = false) String a_id,
			@RequestParam(value = "apf_id", required = false) String apf_id) {
		ActPerson actPerson = new ActPerson();
		Activity activity = new Activity();
		AssPerson assPerson = new AssPerson();
		activity.setA_id(Integer.parseInt(a_id));
		assPerson.setApf_id(Integer.parseInt(apf_id));
		actPerson.setActivity(activity);
		actPerson.setAssPerson(assPerson);
		actPersonService.add(actPerson);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("success1");
		return mav;
	}

	@RequestMapping("/add")
	public String add(ActPerson actPerson) {
		actPersonService.add(actPerson);
		return "redirect:/actPerson/toList";
	}

	@RequestMapping("up")
	public String up(ActPerson actPerson) {
		actPersonService.modify(actPerson);
		return "redirect:/actPerson/toList";

	}

	@RequestMapping("delete")
	public String delete(String Id) {
		actPersonService.delete(Integer.parseInt(Id));
		return "redirect:/actPerson/toList";
	}

}

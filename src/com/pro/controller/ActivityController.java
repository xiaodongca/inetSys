package com.pro.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.domain.Activity;
import com.pro.service.ActivityService;

@Controller
@RequestMapping("activity")
public class ActivityController {

	@Resource(name = "activityService")
	private ActivityService activityService;

	@RequestMapping("/toList")
	public ModelAndView toList(HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.addObject("activityList", activityService.selectAll());
		mav.setViewName("activity/activity");

		return mav;
	}
	
	@RequestMapping("/toListPerson")
	public ModelAndView toListPerson(HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.addObject("activityList", activityService.selectAll());
		mav.setViewName("activity/activityPerson");

		return mav;
	}

	@RequestMapping("/toForm")
	public ModelAndView toForm(
			@RequestParam(value = "Id", required = false) String Id) {
		ModelAndView mav = new ModelAndView();

		if (Id != null) {
			mav.addObject("activity",
					activityService.selectOne(Integer.parseInt(Id)));
			mav.setViewName("activity/upActivity");
		} else {
			mav.setViewName("activity/addActivity");
		}
		return mav;
	}
	

	@RequestMapping("/add")
	public String add(Activity activity) {
		activityService.add(activity);
		return "redirect:/activity/toList";
	}

	@RequestMapping("up")
	public String up(Activity activity) {
		activityService.modify(activity);
		return "redirect:/activity/toList";

	}

	@RequestMapping("delete")
	public String delete(String Id) {
		activityService.delete(Integer.parseInt(Id));
		return "redirect:/activity/toList";
	}
}

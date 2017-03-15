package com.pro.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.domain.AdminUser;
import com.pro.service.AdminUserService;

@Controller
@RequestMapping("/adminUser")
public class AdminUserController {

	@Resource(name = "adminUserService")
	private AdminUserService adminUserService;

	@RequestMapping("/toList")
	public ModelAndView toList(HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.addObject("AdminUserList", adminUserService.selectAll());
		mav.setViewName("adminUser/adminUser");

		return mav;
	}

	@RequestMapping("/toForm")
	public ModelAndView toForm(
			@RequestParam(value = "Id", required = false) String Id) {
		ModelAndView mav = new ModelAndView();

		if (Id != null) {
			mav.addObject("adminUser",
					adminUserService.selectOne(Integer.parseInt(Id)));
			mav.setViewName("adminUser/upAdminUser");
		} else {
			mav.setViewName("adminUser/addAdminUser");
		}
		return mav;
	}

	@RequestMapping("/add")
	public String add(AdminUser adminUser) {
		adminUserService.add(adminUser);
		return "redirect:/adminUser/toList";
	}

	@RequestMapping("up")
	public String up(AdminUser adminUser) {
		adminUserService.modify(adminUser);
		return "redirect:/adminUser/toList";

	}

	@RequestMapping("delete")
	public String delete(String Id) {
		adminUserService.delete(Integer.parseInt(Id));
		return "redirect:/adminUser/toList";
	}

}

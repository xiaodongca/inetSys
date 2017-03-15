package com.pro.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.domain.AssPerson;
import com.pro.domain.NewStudent;
import com.pro.service.NewStudentService;
import com.pro.util.PageModel;

@Controller
@RequestMapping("newStudent")
public class NewStudentController {
	PageModel<NewStudent> model = new PageModel<NewStudent>();//分页
	@Resource(name = "newStudentService")
	private NewStudentService newStudentService;

	@RequestMapping("/toList")
	public ModelAndView toList(HttpSession session) throws Exception {
		if(model.getCurrentpage()==0){
			model.setCurrentpage(1);
		}
		model = newStudentService.selectPageModel(3, model.getCurrentpage());
		ModelAndView mav = new ModelAndView();
		mav.addObject("newStudentList",model.getArrayList());
		mav.addObject("pageCount",model.pagecount());
		mav.addObject("currentpage",model.getCurrentpage());
		mav.setViewName("newStudent/newStudent");
		return mav;
	}

	@RequestMapping("/toForm")
	public ModelAndView toForm(
			@RequestParam(value = "Id", required = false) String Id) {
		ModelAndView mav = new ModelAndView();

		if (Id != null) {
			mav.addObject("newStudent",
					newStudentService.selectOne(Integer.parseInt(Id)));
			mav.setViewName("newStudent/upNewStudent");
		} else {
			mav.setViewName("newStudent/addNewStudent");
		}
		return mav;
	}

	@RequestMapping("/add")
	public String add(NewStudent newStudent) {
		newStudentService.add(newStudent);
		return "redirect:/newStudent/toList";
	}
	
	@RequestMapping("/addPerson")
	public ModelAndView addPerson(NewStudent newStudent) {
		newStudentService.add(newStudent);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/login");
		return mav;
	}

	@RequestMapping("up")
	public String up(NewStudent newStudent) {
		newStudentService.modify(newStudent);
		return "redirect:/newStudent/toList";

	}

	@RequestMapping("delete")
	public String delete(String Id) {
		newStudentService.delete(Integer.parseInt(Id));
		return "redirect:/newStudent/toList";
	}
	@RequestMapping("/last")
	public String last(
				@RequestParam(value="currentpage",required=false) String currentpage){
		if(Integer.parseInt(currentpage)>1){
			model.setCurrentpage(Integer.parseInt(currentpage)-1);
		}else{
			model.setCurrentpage(1);
		}
		return "redirect:/newStudent/toList";
		}
	@RequestMapping("/next")
	public String next(
			@RequestParam(value="currentpage",required=false) String currentpage,
			@RequestParam(value="pageCount",required=false) String pageCount){
				if(Integer.parseInt(currentpage)<Integer.parseInt(pageCount)){
					model.setCurrentpage(Integer.parseInt(currentpage)+1);
				}else{
					model.setCurrentpage(Integer.parseInt(pageCount));
				}
				return "redirect:/newStudent/toList";
			}
	@RequestMapping("/jump")
	public String jump(
			@RequestParam(value="currentpage",required=false) String currentpage){
		model.setCurrentpage(Integer.parseInt(currentpage));
		return "redirect:/newStudent/toList";
	}
}

package com.pro.controller;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.domain.AssPerson;
import com.pro.domain.NewStudent;
import com.pro.domain.Powers;
import com.pro.service.AssPersonService;
import com.pro.service.NewStudentService;
import com.pro.util.PageModel;

@Controller
@RequestMapping("/assPerson")
public class AssPersonController {
	PageModel<AssPerson> model = new PageModel<AssPerson>();//分页
	@Resource(name = "assPersonService")
	private AssPersonService assPersonService;
	@Resource(name = "newStudentService")
	private NewStudentService newStudentService;
	
	@RequestMapping("/toList")
	public ModelAndView toList(HttpSession session) throws Exception {
		if(model.getCurrentpage()==0){
			model.setCurrentpage(1);
		}
		model = assPersonService.selectPageModel(3, model.getCurrentpage());//前面那个显示当前显示数量，后面是第几页
		ModelAndView mav = new ModelAndView();
		mav.addObject("AssPersonList",model.getArrayList());
		mav.addObject("pageCount",model.pagecount());
		mav.addObject("currentpage",model.getCurrentpage());
		mav.setViewName("assPerson/assPerson");
		return mav;
	}
	
	@RequestMapping("/toForm")
	public ModelAndView toForm(@RequestParam(value = "Id", required = false) String Id) {
		ModelAndView mav = new ModelAndView();
		System.out.println("-----1-"+Id);
			if(Id !=null){
				mav.addObject("assPerson",assPersonService.selectOne(Integer.parseInt(Id)));
				mav.setViewName("assPerson/upAssPerson");
			}else {
				mav.setViewName("assPerson/addAssPerson");
			}
		return mav;
	}
	@RequestMapping("/selectOne")
	public ModelAndView selectOne(@RequestParam(value = "Id", required = false) String Id){
		ModelAndView mav = new ModelAndView();
		mav.addObject("assPerson",assPersonService.selectOne(Integer.parseInt(Id)));
		mav.setViewName("assPerson/assPersonPerson");
		return mav;
	}
	
	
	@RequestMapping("/add")
	public String add(AssPerson assPerson){
		assPersonService.add(assPerson);
		return "redirect:/assPerson/toList";
	}
	@RequestMapping("/addPerson")
	public String addPerson(@RequestParam(value = "Id", required = false) String Id){
		NewStudent newStudent = newStudentService.selectOne(Integer.parseInt(Id));
		AssPerson assPerson = new AssPerson();
		assPerson.setApf_name(newStudent.getN_name());
		assPerson.setApf_number(newStudent.getSnumber());
		assPerson.setCredit("0");
		assPerson.setEmail(newStudent.getEmail());
		assPerson.setPassword(newStudent.getSnumber());
		assPerson.setQq(newStudent.getQq());
		assPerson.setTdirrectin(newStudent.getTdirection());
		assPerson.setTel(newStudent.getTel());
		assPerson.setP_id(13);
		
		System.out.println("-----"+newStudent.getN_name());
	
		
		assPersonService.add(assPerson);
		newStudentService.delete(Integer.parseInt(Id));
		return "redirect:/assPerson/toList";
	}
	
	@RequestMapping("/upPassword")
	public ModelAndView upPassword(AssPerson assPerson){
		assPersonService.upPassword(assPerson);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		return mav;
	}
	
	
	@RequestMapping("up")
	public String up(AssPerson assPerson){
		assPersonService.modify(assPerson);
		return "redirect:/assPerson/toList";
		
	}
	
	@RequestMapping("delete")
	public String delete(String Id){
		System.out.println("------"+Id);
		assPersonService.delete(Integer.parseInt(Id));
		return "redirect:/assPerson/toList";
	}
	@RequestMapping("/last")
	public String last(
				@RequestParam(value="currentpage",required=false) String currentpage){
		if(Integer.parseInt(currentpage)>1){
			model.setCurrentpage(Integer.parseInt(currentpage)-1);
		}else{
			model.setCurrentpage(1);
		}
		return "redirect:/assPerson/toList";
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
				return "redirect:/assPerson/toList";
			}
	@RequestMapping("/jump")
	public String jump(
			@RequestParam(value="currentpage",required=false) String currentpage){
		model.setCurrentpage(Integer.parseInt(currentpage));
		return "redirect:/assPerson/toList";
	}
}

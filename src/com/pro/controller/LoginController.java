package com.pro.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pro.domain.AdminUser;
import com.pro.domain.AssPerson;



@Controller
public class LoginController {

	 
    @RequestMapping(value="/login")  
    public ModelAndView login(HttpSession session) throws Exception{        
        //在Session里保存信息  
		ModelAndView mav = new ModelAndView();
		

    	String identity = (String) session.getAttribute("identity");
    	System.out.println("identity;"+identity);
    	if(identity.equals("1")){//判断身份
        	AdminUser adminUser = (AdminUser) session.getAttribute("user");
            session.setAttribute("username", adminUser.getAdmin_name());
            mav.setViewName("index");
    	}else if (identity.equals("2")) {
			AssPerson assPerson =(AssPerson) session.getAttribute("user");
			session.setAttribute("username", assPerson.getApf_name());  
			mav.setViewName("index2");
		}
    	
        System.out.println(4);

		return mav;
    }  
	
	
}

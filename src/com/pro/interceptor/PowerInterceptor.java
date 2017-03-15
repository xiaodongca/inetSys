package com.pro.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.pro.domain.Powers;
import com.pro.service.PowersService;

public class PowerInterceptor implements HandlerInterceptor{
	@Resource(name="powersSerivce")
	public PowersService powersService;
    public String[] allowUrls;//还没发现可以直接配置不拦截的资源，所以在代码里面来排除    
    
    public void setAllowUrls(String[] allowUrls) {    
        this.allowUrls = allowUrls;    
    }    
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object object) throws Exception {
		String requestUrl = request.getRequestURI().replace(request.getContextPath(), "");      
        System.out.println(requestUrl);    
        if(null != allowUrls && allowUrls.length>=1){    
            for(String url : allowUrls) {      
                if(requestUrl.contains(url)) {      
                    return true;      
                }      
            }  
        }
		
         HttpSession session = request.getSession();
 		String url = request.getRequestURI();

		int id =  (Integer) session.getAttribute("powers_id");
		Powers powers =powersService.selectPowers(id);

		
		String range = powers.getP_range();
		System.out.println(range);
		if(range.equals("all")){
			return true;
		}if(range.equals("person")){
			return true;
			
		}else if(url.indexOf(range)>0){
			
			return true;
		}else if(url.indexOf("addPerson")>0){
			return true;
			
		}

		
		System.out.println("你无权访问");
		request.setAttribute("title", "你无权访问");
		request.getRequestDispatcher("../index.jsp").forward(request, response);
		return false;
	}
}

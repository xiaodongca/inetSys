package com.pro.interceptor;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.pro.domain.AdminUser;
import com.pro.domain.AssPerson;
import com.pro.service.AdminUserService;
import com.pro.service.AssPersonService;

public class LoginInterceptor implements HandlerInterceptor {
	@Resource(name = "adminUserService")
	private AdminUserService adminUserService;

	@Resource(name = "assPersonService")
	private AssPersonService assPersonService;
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

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object object) throws Exception {
		String requestUrl = request.getRequestURI().replace(request.getContextPath(), "");      
        System.out.println(requestUrl);    
        if(null != allowUrls && allowUrls.length>=1){    
            for(String url : allowUrls) {      
                if(requestUrl.contains(url)) {      
                    return true;      
                }      
            }  
        }
		String account = null;
		String password = null;
		String identity = null;
		String url = request.getRequestURI();
		System.out.println(url);
		if(url.indexOf("addPerson")>0){
			System.out.println("111111111111111");
			return true;
			
		}
		//获取当前的系统的时间
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");//日期格式
		System.out.println(df.format(new Date()));
		Date date=new Date();
		SimpleDateFormat dateFm = new SimpleDateFormat("EEEE");
		System.out.println(dateFm.format(date));
		// URL:login.jsp是公开的;这个demo是除了login.jsp是可以公开访问的，其它的URL都进行拦截控制	
		account = request.getParameter("account");
		password = request.getParameter("password");
		identity = request.getParameter("identity");// 身份
		System.out.println("seuidhfuad"+identity);
		
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		session.setAttribute("date", df.format(new Date()));
		session.setAttribute("week", dateFm.format(date));

		if (username == null) {
			if (identity.equals("1")) {// 管理员登录
				AdminUser adminUser = adminUserService.login(new AdminUser(
						account, password));
				if (adminUser != null) {
					session.setAttribute("user", adminUser);
					session.setAttribute("identity", identity);
					session.setAttribute("powers_id", adminUser.getPowers()
							.getP_id());
					System.out.println("user_____"+adminUser.getId());
					session.setAttribute("admin_name", adminUser.getAdmin_name());
					
					return true;
				}
			} else if (identity.equals("2")) {// 学生登录
				System.out.println("学生登录1");
				AssPerson assPerson = assPersonService.login(new AssPerson(
						account, password));
				if (assPerson != null) {
					System.out.println("学生登录2");
					session.setAttribute("user", assPerson);
					session.setAttribute("identity", identity);
					session.setAttribute("powers_id", assPerson.getPowers()
							.getP_id());
					session.setAttribute("ass_name", assPerson.getApf_name());
					session.setAttribute("id", assPerson.getApf_id());
					session.setAttribute("password", assPerson.getPassword());
					return true;
				}
			}
		} else if (username != null) {
			return true;
			
		}
		System.out.println("11111111111");
		request.getRequestDispatcher("login.jsp").forward(request, response);
		return false;
	}
}

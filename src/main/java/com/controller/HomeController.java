package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.LoginDAO;
import com.model.LoginUser;

@Controller
public class HomeController {

	@RequestMapping("/contact")
	public String contactForm(Model m,HttpServletRequest req) {
		// Fetching form data
	String message="Contact Form";
	m.addAttribute("message", message);
	req.setAttribute("name", "Apple");
	return "contact";
		
	}
	@RequestMapping("/loginform")
	public String loginForm(@ModelAttribute("login") LoginUser user,Model m) {
		// Fetching form data
	String a="Just a data";
		System.out.println(a);
	return "loginuser";
		
	}
	@RequestMapping("/loginaction")
	public String loginUser(@ModelAttribute("loginuser") LoginUser user,Model m) {
//		System.out.println(user.getEmailid()+ "  "+user.getPassword());
//		m.addAttribute("user", user);
		
		// Authentication logic (Business layer)
		
		//LoginUser ob=new LoginUser(user.getEmailid(),user.getPassword());
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		LoginDAO ob1=(LoginDAO)context.getBean("LoginDao");
		int found=ob1.getUser(user.getEmailid(),user.getPassword());
		if(found!=0) {
		m.addAttribute("mesg", "Found");
		}
		else
			m.addAttribute("error", "Not found");
		// Persistence layer
		return "viewdata";
	}
}

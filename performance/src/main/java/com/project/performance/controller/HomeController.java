package com.project.performance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/map")
	public String map() {
		return "map";
	}
	
	@RequestMapping("/mylist")
	public String mylist() {
		return "mylist";
	}
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/forgotpassword")
	public String forgotpassword() {
		return "forgotpassword";
	}
	@RequestMapping("/detail")
	public String detail() {
		return "detail";
	}
	@RequestMapping("/bigdoor")
	public String bigdoor() {
		return "bigdoor";
	}
	@RequestMapping("/error404")
	public String error404() {
		return "error404";
	}
}

package com.mysite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	// Thymeleaf에 의해 백엔드 파일의 루트는 templates이며, .html도 생략가능하다
	@GetMapping("/main")
	public String index() {
		return "index";
	}
	
	@GetMapping("/test1")
	public String test1() {
		return "basic/test1";
	}
}

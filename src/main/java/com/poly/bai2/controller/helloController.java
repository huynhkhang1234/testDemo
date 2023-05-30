package com.poly.bai2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poly.bai2.entity.User;
@Controller
public class helloController {
	@RequestMapping("/hello")
	public String hello(Model model)
	{
		
		String message = "Hello Huynh Bao Khang nhe";
		model.addAttribute("message", message);
		System.out.println(message);
		User us = new User();
		us.setUsername("huynh khang");
		System.out.println(us.getUsername());
		
		return "hello";
	}
	
	@GetMapping("/test")
	public String test2() {
		return "forward:/hello";
	}
	@GetMapping("/test2")
	public String test3() {
		// tra ve duong dan hello
		return "redirect:/hello";
	}
	
	@ResponseBody
	@GetMapping("/body")
	public String body() {
		return "body";
	}
	
}

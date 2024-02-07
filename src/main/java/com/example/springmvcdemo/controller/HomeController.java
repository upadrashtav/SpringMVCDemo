package com.example.springmvcdemo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springmvcdemo.model.TestLombok;

@Controller

public class HomeController {
	//Controller "C" in MVC pattern
	@GetMapping(value = "/")
	public String homePage() {
	

		TestLombok test = new TestLombok();
		System.out.println("[HomeController] Serving the request at /");
		return "home";
	}
	
	@GetMapping(value = "/welcome")
	public String welcomePage(Model model){
		System.out.println("[HomeController] Serving the Welcome request at /welcome");
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
		String dateTimeStamp = formatter.format(date);
		model.addAttribute("WelcomeDateTimeStamp",dateTimeStamp);
		return "welcome";
	}
}

package com.clarite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clarite.pojo.GoldInfo;

@Controller
public class HomeController {

	  	@RequestMapping("/")
	    public String home() {
	        return "index.html";
	    }
}

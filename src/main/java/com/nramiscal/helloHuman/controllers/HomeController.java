package com.nramiscal.helloHuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
    public String index(@RequestParam(defaultValue="Human", value="name", required=false) String fName, @RequestParam(defaultValue="", value="last_name", required=false) String lName, Model model) {
//		if (searchQuery == null) {
//			searchQuery = "Human";
//		}
		model.addAttribute("name", fName);
		model.addAttribute("lName", lName);
		
		return "index";
    }
}

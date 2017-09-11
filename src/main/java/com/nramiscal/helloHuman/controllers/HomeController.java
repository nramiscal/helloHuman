package com.nramiscal.helloHuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String searchQuery, Model model) {
		if (searchQuery == null) {
			searchQuery = "Human";
		}
		model.addAttribute("name", searchQuery);
		
		return "index";
    }
}

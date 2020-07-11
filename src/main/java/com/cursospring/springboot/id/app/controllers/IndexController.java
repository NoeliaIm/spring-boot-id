package com.cursospring.springboot.id.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cursospring.springboot.id.app.models.service.OneService;

@Controller
public class IndexController {
	
	private OneService servicio= new OneService();
	
	@GetMapping({"","/","/index"})
	public String index(Model model) {
		model.addAttribute("objeto",servicio.operacion());
		return "index";
	}

}

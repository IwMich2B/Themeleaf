package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MotorbikeController {
	
	Motorbike junak = new Motorbike("Junak 50", "Romet");
	
	@GetMapping("/motorbike")
public String getMotorbike(Model model) {
		model.addAttribute("name", "Iwona");
		model.addAttribute("junak", junak);
	return "motorbike";
}
}

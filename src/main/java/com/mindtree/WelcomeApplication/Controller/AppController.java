package com.mindtree.WelcomeApplication.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class AppController {

	@RequestMapping("/page")
	public String print(Model model)
	{
		model.addAttribute("mess","Welcome to SpringMVC Demo");
		return "welcome";
	}
	@RequestMapping("/page")
	public String print(Model model)
	{
		model.addAttribute("mess","Welcome to SpringMVC Demo");
		return "welcome";
	}
}

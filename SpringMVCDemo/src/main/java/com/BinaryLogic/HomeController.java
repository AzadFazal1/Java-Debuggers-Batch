package com.BinaryLogic;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/mainmenu")
	public String showPage() {
		return "main-menu"; // main-menu is a view template that will be called on request mapping
	}
	
}


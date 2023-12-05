package com.BinaryLogic;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		name = name.toUpperCase();
		String result = "Hello !" + name;
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionTwo(@RequestParam("studentName") String theName, Model model) {
		//String name = request.getParameter("studentName");
		theName = theName.toUpperCase();
		String result = "Hello !" + theName;
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	@RequestMapping("/stuForm")
	public String showStudentForm(Model model) {
		model.addAttribute("student", new Student());
		return "stu-form";
	}
	
	@RequestMapping("/processStuForm")
	public String processStudentForm(@ModelAttribute("student") Student theStudent) {
		return "stu-confirmation";
	}
	

}

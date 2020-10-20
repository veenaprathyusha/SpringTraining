package com.training.org;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class WebController {
	private List<String> wordCollection=Arrays.asList("a","b");
	@RequestMapping(value="/index")
	public String index(Model model) {
		model.addAttribute("wcoll",wordCollection);
		return "index";
	}
	
	@RequestMapping(value="/hello")
	public String getDetails(@RequestParam(name="myName", required=false,defaultValue="") String name, Model model) {
		System.out.println("Name is "+name);
		model.addAttribute("name",name);
		return "welcome";
	}
}

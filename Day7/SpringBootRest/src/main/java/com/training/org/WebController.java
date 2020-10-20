package com.training.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class WebController {

	@Autowired
	private MyRestService myRestService;
	@RequestMapping(value="/users")
	public String getUsers(Model model) {
		var users=myRestService.getUsers();
		model.addAttribute("users",users);
		return "user";
	}
}

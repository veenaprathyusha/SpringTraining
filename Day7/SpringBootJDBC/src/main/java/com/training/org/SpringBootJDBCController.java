package com.training.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootJDBCController {
	@Autowired
	private JdbcTemplate jdbc;
	
	@RequestMapping("/insert")
	public String index() {
		jdbc.execute("insert into user(name,email) values('EShan','eshan@gmail.com')");
		return "Data inserted";
	}

}

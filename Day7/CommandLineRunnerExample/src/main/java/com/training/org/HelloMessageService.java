package com.training.org;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
@Service
public class HelloMessageService {
	@Value("${name:unkown}")
	private String name;
	
	
	public String getMessage() {
		return getMessage(name);
		
	}
	
	public String getMessage(String name) {
		return "Hello"+name;
	}

}

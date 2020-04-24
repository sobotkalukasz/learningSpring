package pl.learning.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "<h1>Welcom not auth user</hi>";
	}
	
	@GetMapping("/user")
	public String user() {
		return "<h1>Welcom auth user</hi>";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "<h1>Welcom admin</hi>";
	}


}

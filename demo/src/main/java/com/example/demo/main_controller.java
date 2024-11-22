package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class main_controller {

	
}

// 컨트롤러 외부 클래스로 매핑!!
class abc{
	@GetMapping("/top.do")
	public String top() {
		return null;
	}
}
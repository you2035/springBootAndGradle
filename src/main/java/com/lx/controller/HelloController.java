package com.lx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: liuxin
 * @Date: 2019/12/12 11:23
 * @Description:
 */
@Controller
public class HelloController {
	@GetMapping("/")
	@ResponseBody
	public  String Home() {
		return "Hello";
	}
}

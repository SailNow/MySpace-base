package org.lg.MySpace.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {
	@RequestMapping(method = RequestMethod.GET)
	public String index(){
 		System.out.println("say hello!");
		return "test/index";
	}
}

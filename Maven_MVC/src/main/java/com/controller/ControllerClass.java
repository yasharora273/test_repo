package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {

	@RequestMapping(value = "/")
	public String handle1(){
		System.out.println("in handle method");
		return "hello";
	}
	
	
	@RequestMapping(value = "/hii")
	public String handle2(){
		System.out.println("in handle2 method");
		return "hii_jsp";
	}
}

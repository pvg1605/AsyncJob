package com.async.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.async.main.logic.Selector;

@RestController
public class AsyncController {
	
	@Autowired
	private Selector selector;
	
	
	@GetMapping("/example")
	public String Hello() throws Exception {
		selector.selectQueue();
		return "Successfull";
	}
}

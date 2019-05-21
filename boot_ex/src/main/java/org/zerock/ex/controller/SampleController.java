package org.zerock.ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/sample")
public class SampleController {


	@GetMapping("/hello")
	public String hello() {
		
		log.info("sample.........hello");
		
		return "hello";
	}
	
}

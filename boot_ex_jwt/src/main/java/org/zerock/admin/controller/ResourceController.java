package org.zerock.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class ResourceController {

	@RequestMapping("/get1")
	public String getSample1() {
		
		return "Hello";
	}
}

package org.zerock.admin.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.security.JwtTokenProvider;

import lombok.Setter;

@RestController
@RequestMapping("/admin")
public class SignController {

	@Setter(onMethod_=@Autowired)
	private JwtTokenProvider jwtTokenProvider;
	
	@RequestMapping("/signup")
	public ResponseEntity<String> signup(){
		
		return new ResponseEntity<String>(jwtTokenProvider.createToken("user00", Arrays.asList("ADMIN")),HttpStatus.OK);
	}
	

}

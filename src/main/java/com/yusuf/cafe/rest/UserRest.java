package com.yusuf.cafe.rest;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path="/user")
public interface UserRest {
	
	@PostMapping(path="/signUp")
	public ResponseEntity<String> signUp(@RequestBody(required=true) Map<String, String> requestMap);  

}

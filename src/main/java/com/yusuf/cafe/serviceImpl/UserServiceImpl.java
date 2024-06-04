package com.yusuf.cafe.serviceImpl;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.yusuf.cafe.service.UserService;

@Service
 
public class UserServiceImpl implements UserService{

	@Override
	public ResponseEntity<String> signUp(Map<String, String> requestMap) {
		// TODO Auto-generated method stub
		return null;
	}

}

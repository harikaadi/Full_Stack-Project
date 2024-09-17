package com.amaze.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.amaze.dto.MessageDto;
import com.amaze.dto.TestAddDto;
import com.amaze.exception.InvalidIdException;
import com.amaze.model.Test;
import com.amaze.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testservice;
	
	@PostMapping("/test/add/{diagnosid}")
	public ResponseEntity<?> addTest(@PathVariable int diagnosid,@RequestBody TestAddDto testadddto,MessageDto meassagedto) {
		
		try {
			
			Test test = testservice.addTest(diagnosid,testadddto);
			return ResponseEntity.ok(test);
			
		} catch (InvalidIdException e) {
			
			//e.printStackTrace();
			meassagedto.setMsg(e.getMessage());
			return ResponseEntity.badRequest().body(meassagedto);
		}
		
		
	}

}

package com.dddbootcamp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping
	public ResponseEntity<String> getMessage(){
		return new ResponseEntity<>("DDD bootcamp",HttpStatus.OK);
	}
}

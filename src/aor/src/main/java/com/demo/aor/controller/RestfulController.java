package com.demo.aor.controller;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.aor.data.Data;


@RestController
public class RestfulController {

	private Random random = new Random();
	
	@GetMapping("/data")
	public ResponseEntity<Object> getData(){
		int cpuLoad = this.random.nextInt(100);
		int memLoad = this.random.nextInt(100);
		Data data = new Data(cpuLoad, memLoad);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
}

package com.cpt.payments.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class PaymentTestController {
	
	@GetMapping("/payment")
	public String getPayment() {
		return "Payment working";
	}
	
	@GetMapping("/getHello")
	public ResponseEntity<?> helloWorld(){
		return ResponseEntity.ok().body("hello world");
	}
	
	@PostMapping("/addData")
	public String addData(@RequestParam String data) {
		return data;
	}

}

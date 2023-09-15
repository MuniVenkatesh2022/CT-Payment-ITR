package com.cpt.payments.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class PaymentTestController {
	
	@GetMapping("/payment")
	public String getPayment() {
		return "Payment working";
	}

}

package com.feignclient.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feignclient.custom.CustomerFeignClient;
import com.feignclient.model.Customer;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("feign")
public class FeignClientController {
	
	@Autowired
	public CustomerFeignClient customerFeignClient;
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(FeignClientController.class);

	@GetMapping("/{id}")
	public ResponseEntity<Customer> getProduct(@PathVariable Long id) {
		logger.debug("Notification: Request Received for Customer Id: {}", id);
		return ResponseEntity.ok(customerFeignClient.get(id));
	}

}

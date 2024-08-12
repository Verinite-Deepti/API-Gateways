package com.feignclient.custom;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.feignclient.model.Customer;

@FeignClient(name = "customer-service", configuration = CustomerFeignClientConfig.class) // app-name of Customer register
																						// on Eureka Server
public interface CustomerFeignClient {

	@RequestMapping(method = RequestMethod.GET, value = "/customers/{id}", consumes = "application/json")
	// shorthand
	// @RequestMapping("/customers/{id}")
	public Customer get(@PathVariable(value = "id") Long id);

}
 
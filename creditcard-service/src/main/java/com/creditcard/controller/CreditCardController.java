
package com.creditcard.controller;

import java.util.Collection;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.creditcard.model.CreditCard;
import com.creditcard.service.CreditCardService;


@RestController
@RequestMapping("creditcards")
public class CreditCardController {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CreditCardController.class);

	@Autowired
	private CreditCardService creditcardService;

	@GetMapping("/{id}")
	public ResponseEntity<CreditCard> getCreditCard(@PathVariable String id) {
		logger.info("Notification: Request Received for CreditCard Id: {}", id);
		return ResponseEntity.ok(creditcardService.getCreditCard(id));
	}

	@GetMapping()
	public ResponseEntity<Collection<CreditCard>> get() {
		return ResponseEntity.ok(creditcardService.get());
	}

}

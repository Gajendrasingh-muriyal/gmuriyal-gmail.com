/**
 * 
 */
package com.card.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.card.entity.CardDetails;
import com.card.service.CardDetailsService;

/**
 * @author Softway
 *
 */
@RestController
@RequestMapping("card")
public class CardController {
	
	@Autowired
	CardDetailsService carddetailsservice;
	
	Logger log = LoggerFactory.getLogger(CardController.class);
	@PostMapping("/createcard/create")
	public ResponseEntity<Object> createdCardForCustomer(@RequestBody CardDetails newcarddetails)
	{
		log.info("creating new card for customer");
		 ResponseEntity<Object> newcardUri = carddetailsservice.createcard(newcarddetails);
		 log.debug("new card is created for the customer and URL is" +newcardUri);
		return newcardUri;
}


}
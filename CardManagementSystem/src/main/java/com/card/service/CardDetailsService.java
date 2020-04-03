/**
 * 
 */
package com.card.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.card.entity.CardDetails;
import com.card.repository.CardDetailRepository;

/**
 * @author Softway
 *
 */
@Service
public class CardDetailsService {
	@Autowired
	CardDetailRepository cardreposiory;

	public ResponseEntity<Object> createcard(CardDetails newcarddetails) {
		// TODO Auto-generated method stub
		CardDetails newcarddetailsfromrequest = new CardDetails();
		newcarddetailsfromrequest.setCardname(newcarddetails.getCardname());
		newcarddetailsfromrequest.setCardtype(newcarddetails.getCardtype());
		newcarddetailsfromrequest.setCustomerid(newcarddetails.getCustomerid());
		newcarddetailsfromrequest.setCvv(newcarddetails.getCvv());
		newcarddetailsfromrequest.setExpiredate(newcarddetails.getExpiredate());
		newcarddetailsfromrequest.setLastmodifieddate(newcarddetails.getLastmodifieddate());
		CardDetails carddetails = cardreposiory.save(newcarddetailsfromrequest);
		URI cardlocation = 	ServletUriComponentsBuilder.fromCurrentRequest().path("/cardid").
				buildAndExpand(carddetails.getCardid()).toUri();
		
		return ResponseEntity.created(cardlocation).build();
		
		
	}

}

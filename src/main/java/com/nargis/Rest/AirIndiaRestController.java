package com.nargis.Rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nargis.request.PassengerInfo;
import com.nargis.response.TicketInfo;

@RestController
public class AirIndiaRestController {
	
	
	@PostMapping("/BookFlightTicket")
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo pinfo){
		
		//logic to book ticket
		TicketInfo ticket=new TicketInfo();
		ticket.setName(pinfo.getFname()+""+pinfo.getLname());
		ticket.setFrom(pinfo.getFrom());
		ticket.setTo(pinfo.getTo());
		ticket.setTicketStatus("CONFIRMED");
		ticket.setTicketPrice("2000.00 INR");
	    ticket.setJourneyDate(pinfo.getJourneyDate());
	    
	  return  new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}  
	}

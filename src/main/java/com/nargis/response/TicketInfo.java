package com.nargis.response;

import lombok.Data;

@Data
public class TicketInfo {
	private String name;
	private String to;
	private String from;
	private String flightID;
	private String journeyDate;
	private String ticketPrice;
	private String ticketStatus;

}

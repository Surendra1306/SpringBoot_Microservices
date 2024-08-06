package in.surendra.service;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.surendra.bindings.Passenger;
import in.surendra.bindings.Ticket;
import reactor.core.publisher.Mono;

@Service
public class TripServiceImpl {
	
	public Mono<Ticket> bootTrip(Passenger p){
		
		String BOOK_TICKET = "http://localhost:8086/bookTicket";
		
		 return WebClient.create()
				 .post()
				 .uri(BOOK_TICKET)
				 .body(BodyInserters.fromValue(p))
				 .retrieve()
				 .bodyToMono(Ticket.class);
	}
	
	public Mono<Ticket[]> getTripTickets(){
		
		String ALL_TICKETS = "http://localhost:8086/tickets";
		
		 Mono<Ticket[]> body = WebClient.create()
				 .get()
				 .uri(ALL_TICKETS)
				 .retrieve()
				 .bodyToMono(Ticket[].class);
		return body;
	}

}

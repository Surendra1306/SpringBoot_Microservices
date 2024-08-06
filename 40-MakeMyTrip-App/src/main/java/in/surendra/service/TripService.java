package in.surendra.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.surendra.bindings.Passenger;
import in.surendra.bindings.Ticket;
import reactor.core.publisher.Mono;

@Service
public class TripService {
	
	public Mono<Ticket> bookTicket(Passenger p){
		
		String BOOK_TICKET="http://localhost:8080/bookTicket";
		
		return WebClient.create()
				 .post()
				 .uri(BOOK_TICKET)
				 .body(BodyInserters.fromValue(p))
				 .retrieve()
				 .bodyToMono(Ticket.class);
	}

	public Mono<Ticket[]> getAllTickets(){
		 String VIEW_ALL_TICKETS = "http://localhost:8080/tickets";
		 
		 Mono<Ticket[]> body = WebClient.create()
		 		  .get()
		 		  .uri(VIEW_ALL_TICKETS)
		 		  .retrieve()
		 		  .bodyToMono(Ticket[].class);
		 return body;
	}
	
	public Mono<Ticket> getTicket(Integer tid){
		String VIEW_TICKET = "http://localhost:8080/ticketById"+tid;
		
		Mono<Ticket> mono = WebClient.create()
				 .get()
				 .uri(VIEW_TICKET)
				 .retrieve()
				 .bodyToMono(Ticket.class);
		return mono;
	}
}

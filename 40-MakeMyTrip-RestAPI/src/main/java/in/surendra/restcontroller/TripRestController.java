package in.surendra.restcontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import in.surendra.bindings.Passenger;
import in.surendra.bindings.Ticket;
import in.surendra.service.TripServiceImpl;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class TripRestController {
	
	@Autowired
	private TripServiceImpl tservice;
 
	@PostMapping(value="/tripBooking", consumes="application/json", produces="application/json")
	public ResponseEntity<Mono<Ticket>> saveTicket(@RequestBody Passenger p){
		Mono<Ticket> ticket = tservice.bootTrip(p);
		return new ResponseEntity<>(ticket,HttpStatus.OK);
	}
	
	@GetMapping(value="/allTickets")
	 public Mono<ResponseEntity<List<Ticket>>> getTickets() {
	        Mono<Ticket[]> tripTickets = tservice.getTripTickets();
	        return tripTickets.map(tickets -> ResponseEntity.ok().body(Arrays.asList(tickets)));
	    }
}

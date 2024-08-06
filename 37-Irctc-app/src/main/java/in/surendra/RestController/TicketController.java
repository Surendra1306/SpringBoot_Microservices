package in.surendra.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.surendra.entity.Passenger;
import in.surendra.entity.Ticket;
import in.surendra.service.TicketServiceImpl;

@RestController
public class TicketController {
	
	@Autowired
	private TicketServiceImpl service;

	@PostMapping(value="/bookTicket", consumes="application/json", produces="application/json")
	public ResponseEntity<Ticket> getTicket(@RequestBody Passenger passenger){
		Ticket ticket = service.bookTicket(passenger);
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}
	
	@GetMapping(value="/ticketById/{tid}", produces="application/json")
	public ResponseEntity<Ticket> getTicketById(@PathVariable Integer tid){
		Ticket byId = service.getTicket(tid);
		return new ResponseEntity<>(byId, HttpStatus.OK);
	}
	
	@GetMapping(value="/tickets", produces="application/json")
	public ResponseEntity<List<Ticket>> getAllTickets(){
		List<Ticket> allTickets = service.getAllTickets();
		return new ResponseEntity<List<Ticket>>(allTickets, HttpStatus.OK);
	}
}

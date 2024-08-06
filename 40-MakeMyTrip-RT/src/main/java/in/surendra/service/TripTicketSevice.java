package in.surendra.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.surendra.bindings.Passenger;
import in.surendra.bindings.Ticket;

@Service
public class TripTicketSevice {
	
	public Ticket bookticket(Passenger passenger) {
		
		String BOOK_TICKET = "http://localhost:8086/bookTicket";
		
		RestTemplate rt= new RestTemplate();
		ResponseEntity<Ticket> entity = rt.postForEntity(BOOK_TICKET, passenger, Ticket.class);
		Ticket body = entity.getBody();
		return body;
	}
	
	public List<Ticket> getAllTckets() {
		String GET_ALL_TICKETS = "http://localhost:8086/tickets";
		
		RestTemplate template = new RestTemplate();
		ResponseEntity<Ticket[]> tkts = template.getForEntity(GET_ALL_TICKETS, Ticket[].class);
		 Ticket[] body = tkts.getBody();
		 List<Ticket> list = Arrays.asList(body);
		 return list;
	}
	
	public Ticket getTicketById(Integer tid) {
		String TICKET_STATUS = "http://localhost:8086/ticketById"+tid;
		
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Ticket> entity = rt.getForEntity(TICKET_STATUS,  Ticket.class);
		int value = entity.getStatusCode().value();
		if(value==200) {
			return entity.getBody();
		}
		return null;
	}
}

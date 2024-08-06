package in.surendra.service;

import java.util.List;

import in.surendra.entity.Passenger;
import in.surendra.entity.Ticket;

public interface TicketService {
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer tid);
	
	public List<Ticket> getAllTickets();

}

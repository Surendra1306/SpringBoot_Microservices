package in.surendra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.surendra.entity.Passenger;
import in.surendra.entity.Ticket;
import in.surendra.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService{
	
	@Autowired
	private TicketRepository repo;

	@Override
	public Ticket bookTicket(Passenger passenger) {
		 Ticket ticket=new Ticket();
		 BeanUtils.copyProperties(passenger, ticket);
		 ticket.setTicketstatus("Booked..");
		 repo.save(ticket);
		return ticket;
	}

	@Override
	public Ticket getTicket(Integer tid) {
		 Optional<Ticket> ticketById = repo.findById(tid);
		 if(ticketById.isPresent()) {
			return ticketById.get();
			 }
		return null;
	}

	@Override
	public List<Ticket> getAllTickets() {
		 List<Ticket> list = repo.findAll();
		return list;
	}		

}

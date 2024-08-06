package in.surendra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.surendra.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}

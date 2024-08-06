package in.surendra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import in.surendra.bindings.Passenger;
import in.surendra.bindings.Ticket;
import in.surendra.service.TripService;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class TripController {

	@Autowired
	TripService service;
	
	@GetMapping("/")
	public String loadTicket(Model model) {
		model.addAttribute("passengerObj",new Passenger());
		return "index";
	}
	 
	@PostMapping("/saveTicket")
	public String bookTicket(Model model,Passenger p) {
		Mono<Ticket> ticket = service.bookTicket(p);
		model.addAttribute("bookTicket",ticket);
		return "viewTicket";
	}
	
//	@GetMapping("/status")
//	public String getstatus(Model model,@RequestParam("tid") Integer tid) {
//		Mono<Ticket> tkt = service.getTicket(tid);
//		model.addAttribute("ts",tkt);
//		return "viewTicket";
//	}
	
	@GetMapping("/allTickets")
	public String getTickets(Model model) {
		Mono<Ticket[]> ticketsObj = service.getAllTickets();
		model.addAttribute("tickets",ticketsObj);
		return "allTickets";
	}
	
}

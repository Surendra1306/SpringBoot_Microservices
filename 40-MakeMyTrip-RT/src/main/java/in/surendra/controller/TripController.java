package in.surendra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.surendra.bindings.Passenger;
import in.surendra.bindings.Ticket;
import in.surendra.service.TripTicketSevice;

@Controller
public class TripController {
	
	@Autowired
	private TripTicketSevice service;
	
	 @GetMapping("/")
	 public String loadPassenger(Model model) {
		 model.addAttribute("passObj",new Passenger());
		 model.addAttribute("TktObj",new Ticket());
		 return "index";
	 }
	 
	 @PostMapping("/saveTicket")
	 public String bookTickets(Model model,@ModelAttribute("passObj") Passenger pr) {
		 Ticket ticket = service.bookticket(pr);
		 model.addAttribute("tkt",ticket);
		 model.addAttribute("msg","Booked Successfully..");
		 return "index";
	 }
	
	 @GetMapping("/allTickets")
	 public String ViewAllTicktes(Model model) {
		 List<Ticket> allTickets = service.getAllTckets();
		 model.addAttribute("alltkts",allTickets);
		 return "data";
	 }
	 
	 @GetMapping("/ticketById/")
	 public String getById(@RequestParam(value="tid") Integer tid,Model model) {
		 Ticket byId = service.getTicketById(tid);
		 model.addAttribute("tkt",byId);
		 return "status";
	 }
}

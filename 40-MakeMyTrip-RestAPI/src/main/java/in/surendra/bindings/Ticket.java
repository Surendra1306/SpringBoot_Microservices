package in.surendra.bindings;

import java.time.LocalDate;

public class Ticket {
	private Integer ticketid;
	private String ticketstatus;
	
	private String name;
	private LocalDate dob;
	private LocalDate doj;
	private String gender;
	private String travelFrom;
	private String travelTo;
	private Integer trainNum;
	public Integer getTicketid() {
		return ticketid;
	}
	public void setTicketid(Integer ticketid) {
		this.ticketid = ticketid;
	}
	public String getTicketstatus() {
		return ticketstatus;
	}
	public void setTicketstatus(String ticketstatus) {
		this.ticketstatus = ticketstatus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTravelFrom() {
		return travelFrom;
	}
	public void setTravelFrom(String travelFrom) {
		this.travelFrom = travelFrom;
	}
	public String getTravelTo() {
		return travelTo;
	}
	public void setTravelTo(String travelTo) {
		this.travelTo = travelTo;
	}
	public Integer getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(Integer trainNum) {
		this.trainNum = trainNum;
	}
	
	
}

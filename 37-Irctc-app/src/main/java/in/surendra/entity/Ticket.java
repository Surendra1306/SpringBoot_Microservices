package in.surendra.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ticketid;
	private String ticketstatus;
	
	private String name;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dob;
	@DateTimeFormat(pattern="yyyy-MM-dd")
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
	public String gettravelFrom() {
		return travelFrom;
	}
	public void settravelFrom(String travelFrom) {
		this.travelFrom = travelFrom;
	}
	public String gettravelTo() {
		return travelTo;
	}
	public void settravelTo(String travelTo) {
		this.travelTo = travelTo;
	}
	public Integer getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(Integer trainNum) {
		this.trainNum = trainNum;
	}
	
	
}

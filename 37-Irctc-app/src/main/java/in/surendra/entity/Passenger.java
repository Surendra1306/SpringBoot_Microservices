package in.surendra.entity;

import java.time.LocalDate;

public class Passenger {
	
	private String name;
	private LocalDate dob;
	private LocalDate doj;
	private String gender;
	private String travelFrom;
	private String travelTo;
	private Integer trainNum;
	
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

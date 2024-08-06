package in.surendra.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class PersonPk {
	
	private Integer id;
	private Integer passportId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPassportId() {
		return passportId;
	}
	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}
	@Override
	public String toString() {
		return "PersonPk [id=" + id + ", passportId=" + passportId + "]";
	}
	
	
}

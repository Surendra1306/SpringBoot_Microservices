package in.surendra.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Person {
	
	private String name;
	private String city;
	
	//generators will not work ,when table having more than one PK(i.e in case of composite PK)
	
	@EmbeddedId
	private PersonPk pk;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public PersonPk getPk() {
		return pk;
	}

	public void setPk(PersonPk pk) {
		this.pk = pk;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", pk=" + pk + "]";
	}
	
	
	
}

package nl.ycfase2juni.yc2206bezorgapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Maaltijd {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	String naam;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	
}

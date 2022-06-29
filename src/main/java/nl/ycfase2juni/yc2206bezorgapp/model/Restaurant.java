package nl.ycfase2juni.yc2206bezorgapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String naam;
	private String cuisine;
	private boolean geopend;
	private String adres;
	private int bezorger;
	
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
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public boolean isGeopend() {
		return geopend;
	}
	public void setGeopend(boolean geopend) {
		this.geopend = geopend;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public int getBezorger() {
		return bezorger;
	}
	public void setBezorger(int bezorger) {
		this.bezorger = bezorger;
	}
	
	

}

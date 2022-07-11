package nl.ycfase2juni.yc2206bezorgapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String naam;
	private String cuisine;
	private boolean geopend;
	private String adres;
	private int bezorger;
	
	@OneToMany(orphanRemoval = true, mappedBy = "restaurant")
	private List<Maaltijd> maaltijden;
	
	@OneToMany(orphanRemoval = true, mappedBy = "restaurant")
	private List<Bestelling> bestellingen;
	
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
	
	public List<Maaltijd> getMaaltijden() {
		return maaltijden;
	}
	
	public void setMaaltijden(List<Maaltijd> maaltijden) {
		this.maaltijden = maaltijden;
	}
	public List<Bestelling> getBestellingen() {
		return bestellingen;
	}
	public void setBestellingen(List<Bestelling> bestellingen) {
		this.bestellingen = bestellingen;
	}
	
	

}

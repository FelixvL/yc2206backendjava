package nl.ycfase2juni.yc2206bezorgapp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Bestelling {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private float maaltijd_prijs;
	private float totaal_prijs;
	private boolean betaald;
	private String status;
	private String opmerking;
	
	@ManyToMany
	private List<Maaltijd> maaltijden = new ArrayList();
	
	@ManyToOne(optional = false)
	private Restaurant restaurant;
	
	@ManyToOne(optional = false)
	private Klant klant;
	
	@ManyToOne(optional = false)
	private Bezorger bezorger;
	
	public void voegMaaltijdToe(Maaltijd m) {
		maaltijden.add(m);
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public float getMaaltijd_prijs() {
		return maaltijd_prijs;
	}
	public void setMaaltijd_prijs(float maaltijd_prijs) {
		this.maaltijd_prijs = maaltijd_prijs;
	}
	public float getTotaal_prijs() {
		return totaal_prijs;
	}
	public void setTotaal_prijs(float totaal_prijs) {
		this.totaal_prijs = totaal_prijs;
	}
	public boolean isBetaald() {
		return betaald;
	}
	public void setBetaald(boolean betaald) {
		this.betaald = betaald;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOpmerking() {
		return opmerking;
	}
	public void setOpmerking(String opmerking) {
		this.opmerking = opmerking;
	}

	
	public List<Maaltijd> getMaaltijden() {
		return maaltijden;
	}

	public void setMaaltijden(List<Maaltijd> maaltijden) {
		this.maaltijden = maaltijden;
	}
	
	public Klant getKlant() {
		return klant;
	}

	public void setKlant(Klant klant) {
		this.klant = klant;
	}
	
	public Bezorger getBezorger() {
		return bezorger;
	}

	public void setBezorger(Bezorger bezorger) {
		this.bezorger = bezorger;
	}

	@JsonIgnore 
	public Restaurant getRestaurant() {
		return restaurant;
	}
	
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	
	

}

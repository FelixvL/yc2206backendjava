package nl.ycfase2juni.yc2206bezorgapp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Bestelling {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	// klant_id
	// maaltijd_id
	private float maaltijd_prijs;
	private float totaal_prijs;
	private boolean betaald;
	private String status;
	private String opmerking;
	
	@ManyToMany
	private List<Maaltijd> maaltijden = new ArrayList();
	
	
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
	public void setMaaltijd_prijs(int maaltijd_prijs) {
		this.maaltijd_prijs = maaltijd_prijs;
	}
	public float getTotaal_prijs() {
		return totaal_prijs;
	}
	public void setTotaal_prijs(int totaal_prijs) {
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
	
	
	
	

}

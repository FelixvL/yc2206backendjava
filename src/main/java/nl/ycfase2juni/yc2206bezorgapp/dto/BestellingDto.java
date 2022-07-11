package nl.ycfase2juni.yc2206bezorgapp.dto;

import nl.ycfase2juni.yc2206bezorgapp.model.Bestelling;
import nl.ycfase2juni.yc2206bezorgapp.model.Maaltijd;

public class BestellingDto {
	
	private long id;
	
	private float maaltijd_prijs;
	
	private float totaal_prijs;
	
	private boolean betaald;
	
	private String status;
	
	private String opmerking;
	
	private String restaurantNaam;

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
	
	public String getRestaurantNaam() {
		return restaurantNaam;
	}
	
	public void setRestaurantNaam(String restaurantNaam) {
		this.restaurantNaam = restaurantNaam;
	}
	
	public static BestellingDto createFromModel(Bestelling bestelling) {
		BestellingDto bestellingDto = new BestellingDto();

		bestellingDto.setMaaltijd_prijs(bestelling.getMaaltijd_prijs());
		bestellingDto.setTotaal_prijs(bestelling.getTotaal_prijs());
		bestellingDto.setId(bestelling.getId());
		bestellingDto.setBetaald(bestelling.isBetaald());
		bestellingDto.setStatus(bestelling.getStatus());
		bestellingDto.setOpmerking(bestelling.getOpmerking());
		bestellingDto.setRestaurantNaam(bestelling.getRestaurant().getNaam());
		
		return bestellingDto;
	}

}

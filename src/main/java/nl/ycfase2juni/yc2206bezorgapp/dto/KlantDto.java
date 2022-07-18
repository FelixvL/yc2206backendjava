package nl.ycfase2juni.yc2206bezorgapp.dto;

import nl.ycfase2juni.yc2206bezorgapp.model.Bestelling;
import nl.ycfase2juni.yc2206bezorgapp.model.Klant;

public class KlantDto {
	
	private long id;
	
	private String naam;
	
	private String adres;
	
	private String telefoonnummer;
	
	private String email;

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

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getTelefoonnummer() {
		return telefoonnummer;
	}

	public void setTelefoonnummer(String telefoonnummer) {
		this.telefoonnummer = telefoonnummer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public static KlantDto createFromModel(Klant klant) {
		KlantDto klantDto = new KlantDto();
		
		klantDto.setNaam(klant.getNaam());
		klantDto.setAdres(klant.getAdres());
		klantDto.setId(klant.getId());
		klantDto.setTelefoonnummer(klant.getTelefoonnummer());
		klantDto.setEmail(klant.getEmail());
		
		return klantDto;
	}
	
}

package nl.ycfase2juni.yc2206bezorgapp.dto;

import nl.ycfase2juni.yc2206bezorgapp.model.Bezorger;

public class BezorgerDto {
	
	private long id;
	
	private String naam;
	
	private String email;
	
	private String telefoonnummer;
	
	private String restaurantNaam;

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

	
	public String getEmail() {
		return email;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getTelefoonnummer() {
		return telefoonnummer;
	}

	
	public void setTelefoonnummer(String telefoonnummer) {
		this.telefoonnummer = telefoonnummer;
	}

	
	public String getRestaurantNaam() {
		return restaurantNaam;
	}

	
	public void setRestaurantNaam(String restaurantNaam) {
		this.restaurantNaam = restaurantNaam;
	}
	
	
	public static BezorgerDto createFromModel(Bezorger bezorger) {
		BezorgerDto bezorgerDto = new BezorgerDto();

		bezorgerDto.setNaam(bezorger.getNaam());
		bezorgerDto.setEmail(bezorger.getEmail());
		bezorgerDto.setId(bezorger.getId());
		bezorgerDto.setTelefoonnummer(bezorger.getTelefoonnummer());
		bezorgerDto.setRestaurantNaam(bezorger.getRestaurant().getNaam());
		
		return bezorgerDto;
	}
	

}

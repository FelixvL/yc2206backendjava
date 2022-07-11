package nl.ycfase2juni.yc2206bezorgapp.dto;

import nl.ycfase2juni.yc2206bezorgapp.model.Maaltijd;

public class MaaltijdDto {

	private long id;
	
	private String naam;

	private String beschrijving;
	
	private int calorieen;
	
	private float prijs;
	
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

	public String getBeschrijving() {
		return beschrijving;
	}

	public void setBeschrijving(String beschrijving) {
		this.beschrijving = beschrijving;
	}

	public int getCalorieen() {
		return calorieen;
	}

	public void setCalorieen(int calorieen) {
		this.calorieen = calorieen;
	}

	public float getPrijs() {
		return prijs;
	}

	public void setPrijs(float prijs) {
		this.prijs = prijs;
	}
	
	public String getRestaurantNaam() {
		return restaurantNaam;
	}
	
	public void setRestaurantNaam(String restaurantNaam) {
		this.restaurantNaam = restaurantNaam;
	}
	
	public static MaaltijdDto createFromModel(Maaltijd maaltijd) {
		MaaltijdDto maaltijdDto = new MaaltijdDto();

		maaltijdDto.setBeschrijving(maaltijd.getBeschrijving());
		maaltijdDto.setCalorieen(maaltijd.getCalorieen());
		maaltijdDto.setId(maaltijd.getId());
		maaltijdDto.setNaam(maaltijd.getNaam());
		maaltijdDto.setPrijs(maaltijd.getPrijs());
		maaltijdDto.setRestaurantNaam(maaltijd.getRestaurant().getNaam());
		
		return maaltijdDto;
	}
	
}

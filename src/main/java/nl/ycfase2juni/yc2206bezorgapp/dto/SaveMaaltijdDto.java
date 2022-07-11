package nl.ycfase2juni.yc2206bezorgapp.dto;

public class SaveMaaltijdDto {

	private String naam;

	private String beschrijving;

	private int calorieen;

	private float prijs;

	private int restaurantId;

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

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

}

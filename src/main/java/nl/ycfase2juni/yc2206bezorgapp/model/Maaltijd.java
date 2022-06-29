package nl.ycfase2juni.yc2206bezorgapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Maaltijd {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String naam;
	private String beschrijving;
	private int calorieen;
	private float prijs;

	@ManyToMany
	private List<Ingredient> ingredient1;

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

	public List<Ingredient> getIngredient1() {
		return ingredient1;
	}

	public void setIngredient1(List<Ingredient> ingredient1) {
		this.ingredient1 = ingredient1;
	}
	
	
	
	
}

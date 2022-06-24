package nl.ycfase2juni.yc2206bezorgapp.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.ycfase2juni.yc2206bezorgapp.model.Ingredient;
import nl.ycfase2juni.yc2206bezorgapp.persistence.IngredientService;

@RestController
public class IngredientEndpoint {
	
	@Autowired
	IngredientService is;
	
	
	@GetMapping("ingredientoverzicht")
	public Iterable<Ingredient> overzichtIngredienten() {
		return is.geefAllIngredienten();
	}
}

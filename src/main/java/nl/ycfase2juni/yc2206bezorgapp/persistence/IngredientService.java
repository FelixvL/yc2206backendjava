package nl.ycfase2juni.yc2206bezorgapp.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.ycfase2juni.yc2206bezorgapp.model.Ingredient;

@Service
public class IngredientService {
	@Autowired
	IngredientRepository ir;

	public Iterable<Ingredient> geefAllIngredienten() {
		return ir.findAll();
	}
}

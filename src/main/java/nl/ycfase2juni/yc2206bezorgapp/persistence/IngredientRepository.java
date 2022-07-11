package nl.ycfase2juni.yc2206bezorgapp.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.ycfase2juni.yc2206bezorgapp.model.Ingredient;

@Component
public interface IngredientRepository extends CrudRepository<Ingredient, Long> {

}

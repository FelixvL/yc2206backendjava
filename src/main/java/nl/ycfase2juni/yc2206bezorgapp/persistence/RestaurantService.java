package nl.ycfase2juni.yc2206bezorgapp.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.ycfase2juni.yc2206bezorgapp.model.Restaurant;

@Service
public class RestaurantService {
	@Autowired
	RestaurantRepository rr;

	public Optional<Restaurant> findById(long id) {
		return this.rr.findById(id);
	}

	public void restaurantInvoeren(Restaurant r) {
		rr.save(r);
	}

	public List<Restaurant> geefAlleRestaurants() {
		return rr.findAll();
	}
	
}


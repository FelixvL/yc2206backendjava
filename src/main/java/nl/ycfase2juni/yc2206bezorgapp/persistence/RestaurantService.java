package nl.ycfase2juni.yc2206bezorgapp.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.ycfase2juni.yc2206bezorgapp.model.Restaurant;

@Service
public class RestaurantService {
	@Autowired
	RestaurantRepository rr;

	public void restaurantInvoeren(Restaurant r) {
		rr.save(r);
			
	}

	public Iterable<Restaurant> geefAlleRestaurants() {
		return rr.findAll();
	}
}


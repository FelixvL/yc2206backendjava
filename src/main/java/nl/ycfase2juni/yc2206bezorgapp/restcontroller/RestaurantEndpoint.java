package nl.ycfase2juni.yc2206bezorgapp.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.ycfase2juni.yc2206bezorgapp.model.Restaurant;
import nl.ycfase2juni.yc2206bezorgapp.persistence.RestaurantService;

@RestController
public class RestaurantEndpoint {
	@Autowired
	RestaurantService rs;
	
	@PostMapping("restaurantinvoeren")
	public void maaltijdInvoeren(@RequestBody Restaurant r) {
		System.out.println(r.getNaam());
		rs.restaurantInvoeren(r);
		
	}
	
	@GetMapping("overzichtrestaurants")
	public Iterable<Restaurant> overzichtRestaurants() {
		return rs.geefAlleRestaurants();
		
	}
}
package nl.ycfase2juni.yc2206bezorgapp.restcontroller;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.ycfase2juni.yc2206bezorgapp.dto.RestaurantDto;
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
	public Stream<RestaurantDto> overzichtRestaurants() {
		return rs.geefAlleRestaurants().stream().map( r -> {
			RestaurantDto restaurantDto = new RestaurantDto();
			
			restaurantDto.setAdres(r.getAdres());
			restaurantDto.setBezorger(r.getBezorger());
			restaurantDto.setCuisine(r.getCuisine());
			restaurantDto.setGeopend(r.isGeopend());
			restaurantDto.setNaam(r.getNaam());
			restaurantDto.setId(r.getId());
			
			return restaurantDto;
		});
		
	}
}
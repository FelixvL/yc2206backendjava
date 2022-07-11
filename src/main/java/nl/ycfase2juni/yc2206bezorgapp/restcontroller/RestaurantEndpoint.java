package nl.ycfase2juni.yc2206bezorgapp.restcontroller;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.ycfase2juni.yc2206bezorgapp.dto.RestaurantDto;
import nl.ycfase2juni.yc2206bezorgapp.model.Restaurant;
import nl.ycfase2juni.yc2206bezorgapp.persistence.MaaltijdRepository;
import nl.ycfase2juni.yc2206bezorgapp.persistence.RestaurantRepository;
import nl.ycfase2juni.yc2206bezorgapp.persistence.RestaurantService;

@RestController
public class RestaurantEndpoint {
	@Autowired
	RestaurantService rs;
	
	@Autowired
	RestaurantRepository rr;
	
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

	@DeleteMapping("verwijderrestaurant/{restaurantid}")
	public void verwijderMaaltijd(@PathVariable("restaurantid") int restaurantid){
		long mid = restaurantid;
		rr.deleteById(mid);
	}

	@DeleteMapping("resturant/{id}")
	public void delete(@PathVariable long id) {
		this.rs.deleteById(id);
	}

}
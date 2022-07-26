package nl.ycfase2juni.yc2206bezorgapp.restcontroller;

import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.ycfase2juni.yc2206bezorgapp.dto.BezorgerDto;
import nl.ycfase2juni.yc2206bezorgapp.dto.SaveBezorgerDto;
import nl.ycfase2juni.yc2206bezorgapp.model.Bezorger;
import nl.ycfase2juni.yc2206bezorgapp.model.Maaltijd;
import nl.ycfase2juni.yc2206bezorgapp.model.Restaurant;
import nl.ycfase2juni.yc2206bezorgapp.persistence.BezorgerRepository;
import nl.ycfase2juni.yc2206bezorgapp.persistence.BezorgerService;
import nl.ycfase2juni.yc2206bezorgapp.persistence.RestaurantService;

@RestController
public class BezorgerEndpoint {
	
	@Autowired
	BezorgerService bes;
	
	@Autowired
	RestaurantService rs;
	
	@Autowired
	BezorgerRepository ber;
	
	@GetMapping("overzichtbezorgers")
	public Stream<BezorgerDto> overzichtBezorgers() {
		return bes.geefAlleBezorgers().stream().map(BezorgerDto::createFromModel);
	}
	
	@PostMapping("bezorgerinvoeren")
	public void bezorgerinvoeren(@RequestBody SaveBezorgerDto dto) {
		Bezorger bezorger = new Bezorger();
		bezorger.setNaam(dto.getNaam());
		bezorger.setTelefoonnummer(dto.getTelefoonnummer());
		bezorger.setEmail(dto.getEmail());

		Optional<Restaurant> optionalRestaurant = rs.findById(dto.getRestaurantId());
		bezorger.setRestaurant(optionalRestaurant.get());

		bes.bezorgerInvoeren(bezorger);
		
	}
	
	@DeleteMapping("verwijderbezorger/{bezorgerid}")
	public void verwijderBezorger(@PathVariable("bezorgerid") int bezorgerid){
		long beid = bezorgerid;
		ber.deleteById(beid);
	}
	
	

}

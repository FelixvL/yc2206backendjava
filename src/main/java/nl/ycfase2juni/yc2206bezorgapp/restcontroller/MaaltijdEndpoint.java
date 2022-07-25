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

import nl.ycfase2juni.yc2206bezorgapp.dto.MaaltijdDto;
import nl.ycfase2juni.yc2206bezorgapp.dto.SaveMaaltijdDto;
import nl.ycfase2juni.yc2206bezorgapp.model.Maaltijd;
import nl.ycfase2juni.yc2206bezorgapp.model.Restaurant;
import nl.ycfase2juni.yc2206bezorgapp.persistence.MaaltijdRepository;
import nl.ycfase2juni.yc2206bezorgapp.persistence.MaaltijdService;
import nl.ycfase2juni.yc2206bezorgapp.persistence.RestaurantService;

@RestController
public class MaaltijdEndpoint {

	@Autowired
	MaaltijdService ms;

	@Autowired
	RestaurantService rs;
	
	@Autowired
	MaaltijdRepository mr;

	@PostMapping("maaltijdinvoeren")
	public void maaltijdInvoeren(@RequestBody SaveMaaltijdDto dto) {
		Maaltijd maaltijd = new Maaltijd();
		maaltijd.setBeschrijving(dto.getBeschrijving());
		maaltijd.setNaam(dto.getNaam());
		maaltijd.setPrijs(dto.getPrijs());

		Optional<Restaurant> optionalRestaurant = rs.findById(dto.getRestaurantId());
		maaltijd.setRestaurant(optionalRestaurant.get());

		ms.maaltijdInvoeren(maaltijd);
	}
	
	@GetMapping("overzichtmaaltijden")
	public Stream<MaaltijdDto> overzichtMaaltijden() {
		return ms.geefAlleMaaltijden().stream().map(MaaltijdDto::createFromModel);
	}
	
	@GetMapping("overzichtmaaltijden/restaurant/{id}")
	public Stream<MaaltijdDto> overzichtMaaltijden(@PathVariable long id) {
		Optional<Restaurant> optionalRestaurant = rs.findById(id);

		return optionalRestaurant.get().getMaaltijden().stream().map(MaaltijdDto::createFromModel);
	}
	
	@DeleteMapping("verwijdermaaltijd/{maaltijdid}")
	public void verwijderMaaltijd(@PathVariable("maaltijdid") int maaltijdid){
		long mid = maaltijdid;
		mr.deleteById(mid);
	}
}
	
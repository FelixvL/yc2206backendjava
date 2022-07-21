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

import nl.ycfase2juni.yc2206bezorgapp.dto.BestellingDto;
import nl.ycfase2juni.yc2206bezorgapp.dto.StartbestellingDto;
import nl.ycfase2juni.yc2206bezorgapp.model.Bestelling;
import nl.ycfase2juni.yc2206bezorgapp.model.Klant;
import nl.ycfase2juni.yc2206bezorgapp.model.Restaurant;
import nl.ycfase2juni.yc2206bezorgapp.persistence.BestellingRepository;
import nl.ycfase2juni.yc2206bezorgapp.persistence.BestellingService;
import nl.ycfase2juni.yc2206bezorgapp.persistence.KlantService;
import nl.ycfase2juni.yc2206bezorgapp.persistence.RestaurantService;

@RestController
public class BestellingEndpoint {
	@Autowired
	BestellingService bs;
	
	@Autowired
	RestaurantService rs;
	
	@Autowired
	KlantService ks;
	
	@Autowired
	BestellingRepository br;
	
//	@PostMapping("bestellinginvoeren/{maaltijd_id}")
//	public void bestellingInvoeren(@RequestBody Bestelling b, @PathVariable("maaltijd_id") int maaltijd_id) {
//		System.out.println(b.getId());
//		bs.bestellingInvoeren(b, maaltijd_id);
//	}

	// Angular
	@PostMapping("bestellinginvoeren")
	public void klantBestellingInvoeren(@RequestBody StartbestellingDto b) {
		Bestelling bestelling = new Bestelling();
		bestelling.setBetaald(false);
		bestelling.setOpmerking(b.getOpmerking());
		bestelling.setStatus("nieuw");

		bs.bestellingInvoeren(bestelling, b.getMaaltijdId(), b.getKlantId());
	}

	// Native
	@PostMapping("bestellinginvoeren/{maaltijd_id}/{klant_id}")
	public void klantBestellingInvoeren(@RequestBody Bestelling b, @PathVariable("maaltijd_id") long maaltijd_id, @PathVariable("klant_id") long klant_id) {
		System.out.println(b.getId());
		bs.bestellingInvoeren(b, maaltijd_id, klant_id);
	}
	
	@GetMapping("overzichtbestellingen")
	public Stream<BestellingDto> overzichtBestellingen() {
		return bs.geefAlleBestellingen().stream().map(BestellingDto::createFromModel);
	}

	@GetMapping("overzichtbestellingen/restaurant/{id}")
	public Stream<BestellingDto> overzichtBestellingen(@PathVariable long id) {
		Optional<Restaurant> optionalRestaurant = rs.findById(id);

		return optionalRestaurant.get().getBestellingen().stream().map(BestellingDto::createFromModel);
	}

	@GetMapping("overzichtklantbestellingen/klant/{id}")
	public Stream<BestellingDto> overzichtKlantBestellingen(@PathVariable long id) {
		Optional<Klant> optionalKlant = ks.findById(id);

		return optionalKlant.get().getBestellingen().stream().map(BestellingDto::createFromModel);
	}

	@DeleteMapping("verwijderbestelling/{bestellingid}")
	public void verwijderMaaltijd(@PathVariable("bestellingid") int bestellingid){
		long bid = bestellingid;
		br.deleteById(bid);
	}	
	
}


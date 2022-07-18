package nl.ycfase2juni.yc2206bezorgapp.restcontroller;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.ycfase2juni.yc2206bezorgapp.dto.BestellingDto;
import nl.ycfase2juni.yc2206bezorgapp.dto.KlantDto;
import nl.ycfase2juni.yc2206bezorgapp.model.Klant;
import nl.ycfase2juni.yc2206bezorgapp.model.Restaurant;
import nl.ycfase2juni.yc2206bezorgapp.persistence.KlantService;

@RestController
public class KlantEndpoint {
	
	@Autowired
	KlantService ks;

	@GetMapping("overzichtklanten")
	public Stream<KlantDto> overzichtKlanten() {
		return ks.geefAlleKlanten().stream().map(KlantDto::createFromModel);
	}
	
	@PostMapping("klantinvoeren")
	public void klantInvoeren(@RequestBody Klant k) {
		System.out.println(k.getNaam());
		ks.klantInvoeren(k);
		
	}
	
}

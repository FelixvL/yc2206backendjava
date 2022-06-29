package nl.ycfase2juni.yc2206bezorgapp.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.ycfase2juni.yc2206bezorgapp.model.Bestelling;
import nl.ycfase2juni.yc2206bezorgapp.persistence.BestellingService;

@RestController
public class BestellingEndpoint {
	@Autowired
	BestellingService bs;
	
	@PostMapping("bestellinginvoeren/{maaltijd_id}")
	public void bestellingInvoeren(@RequestBody Bestelling b, @PathVariable("maaltijd_id") int maaltijd_id) {
		System.out.println(b.getId());
		bs.bestellingInvoeren(b, maaltijd_id);
		
	}

}
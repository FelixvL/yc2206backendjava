package nl.ycfase2juni.yc2206bezorgapp.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.ycfase2juni.yc2206bezorgapp.model.Maaltijd;
import nl.ycfase2juni.yc2206bezorgapp.persistence.MaaltijdService;

@RestController
public class MaaltijdEndpoint {
	@Autowired
	MaaltijdService ms;
	
	@GetMapping("pittigedag/{mijnwaarde}")
	public void abc(@PathVariable("mijnwaarde") String voornaam) {
		System.out.println("dit is variable: "+ voornaam);

	}
	@GetMapping("twee")
	public Maaltijd abracadabra() {
		System.out.println("een hij doet het!");
		ms.daargaanwe();
		Maaltijd m = new Maaltijd();
		m.setNaam("Patat");
		return m;
	}
	@PostMapping("maaltijdinvoeren")
	public void maaltijdInvoeren(@RequestBody Maaltijd m) {
		System.out.println(m.getNaam());
		ms.maaltijdInvoeren(m);
		
	}
	
	
}
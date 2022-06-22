package nl.ycfase2juni.yc2206bezorgapp.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
	public void abracadabra() {
		System.out.println("een hij doet het!");
		ms.daargaanwe();
	}
}
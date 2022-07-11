package nl.ycfase2juni.yc2206bezorgapp.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.ycfase2juni.yc2206bezorgapp.model.Maaltijd;
import nl.ycfase2juni.yc2206bezorgapp.persistence.MaaltijdRepository;

@RestController
public class FelixEndpoint {
	@Autowired
	MaaltijdRepository mr;

	@Autowired
	FelixModelRepository fmr;
	
	
	@GetMapping("felixallemaaltijden")
	public Iterable<Maaltijd> alleMaaltijden(){
		return mr.findAll();
	}

	@PostMapping("api/maaltijd")
	public Maaltijd maakMaaltijdAan(@RequestBody Maaltijd m){
		System.out.println("maaltijd is aangemaakt");
		mr.save(m);
		return m;
	}
	@DeleteMapping("verwijdermaaltijd/{maaltijdid}")
	public void verwijderMaaltijd(@PathVariable("maaltijdid") int maaltijdid){
		long mid = maaltijdid;
		mr.deleteById(mid);
	}
	@PostMapping("dingmetplaatje")
	public void dingmetplaatje(@RequestBody FelixModel fm) {
		System.out.println("we zitten in de post");
//		fmr.save(fm);
	}
}

package nl.ycfase2juni.yc2206bezorgapp.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.ycfase2juni.yc2206bezorgapp.model.Bestelling;
import nl.ycfase2juni.yc2206bezorgapp.model.Klant;

@Service
public class KlantService {
	
	@Autowired
	KlantRepository kr;

	public Optional<Klant> findById(long id) {
		return this.kr.findById(id);
	}
	
	public void klantInvoeren(Klant k) {
		kr.save(k);
		
	}
	
	public List<Klant> geefAlleKlanten() {
		return kr.findAll();
	}
	

}

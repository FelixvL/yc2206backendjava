package nl.ycfase2juni.yc2206bezorgapp.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.ycfase2juni.yc2206bezorgapp.model.Bestelling;
import nl.ycfase2juni.yc2206bezorgapp.model.Maaltijd;

@Service
public class BestellingService {
	@Autowired
	BestellingRepository br;
	
	@Autowired
	MaaltijdRepository mr;
	
	public void bestellingInvoeren(Bestelling b, long maaltijd_id) {
		Maaltijd m = mr.findById(maaltijd_id).get();
		b.voegMaaltijdToe(m);
		br.save(b);
			
	}


	public List<Bestelling> geefAlleBestellingen() {
		return br.findAll();
	}

}
package nl.ycfase2juni.yc2206bezorgapp.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.ycfase2juni.yc2206bezorgapp.model.Bestelling;
import nl.ycfase2juni.yc2206bezorgapp.model.Klant;
import nl.ycfase2juni.yc2206bezorgapp.model.Maaltijd;
import nl.ycfase2juni.yc2206bezorgapp.model.Restaurant;

@Service
public class BestellingService {
	@Autowired
	BestellingRepository br;
	
	@Autowired
	RestaurantRepository rr;
	
	@Autowired
	MaaltijdRepository mr;
	
	@Autowired
	KlantRepository kr;
	
	public void bestellingInvoeren(Bestelling b, long maaltijd_id, long klant_id) {
		Maaltijd m = mr.findById(maaltijd_id).get();
		Klant k = kr.findById(klant_id).get();
		Restaurant temp = rr.findById(8L).get();
		
		b.voegMaaltijdToe(m);
		b.setKlant(k);
		b.setRestaurant(temp);
		br.save(b);	
	}
	
			
	public List<Bestelling> geefAlleBestellingen() {
		return br.findAll();
	}



}
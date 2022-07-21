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
	
	public void bestellingInvoeren(long maaltijdId, long klantId, String opmerking) {
		Maaltijd m = mr.findById(maaltijdId).get();
		Klant k = kr.findById(klantId).get();

		Bestelling b = new Bestelling();
		b.setBetaald(false);
		b.setMaaltijd_prijs((int)(m.getPrijs() * 100));
		b.setOpmerking(opmerking);
		b.setStatus("");
		b.voegMaaltijdToe(m);
		b.setKlant(k);
		b.setRestaurant(m.getRestaurant());
		
		br.save(b);	
	}
	
			
	public List<Bestelling> geefAlleBestellingen() {
		return br.findAll();
	}



}
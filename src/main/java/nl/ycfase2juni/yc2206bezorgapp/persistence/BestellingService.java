package nl.ycfase2juni.yc2206bezorgapp.persistence;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.ycfase2juni.yc2206bezorgapp.model.Bestelling;
import nl.ycfase2juni.yc2206bezorgapp.model.Bezorger;
import nl.ycfase2juni.yc2206bezorgapp.model.Klant;
import nl.ycfase2juni.yc2206bezorgapp.model.Maaltijd;
import nl.ycfase2juni.yc2206bezorgapp.model.Restaurant;

@Service
public class BestellingService {
	
	private final Random random = new Random();
	
	@Autowired
	BestellingRepository br;
	
	@Autowired
	RestaurantRepository rr;
	
	@Autowired
	MaaltijdRepository mr;
	
	@Autowired
	KlantRepository kr;

	@Autowired
	BezorgerRepository ber;

	public void bestellingInvoeren(Bestelling b, long maaltijdId, long klantId) {
		Maaltijd m = mr.findById(maaltijdId).get();
		Klant k = kr.findById(klantId).get();
		Restaurant r = m.getRestaurant();

		List<Bezorger> bezorgers = r.getBezorgers();
		Bezorger be = bezorgers.get(random.nextInt(bezorgers.size()));

		b.setMaaltijd_prijs(m.getPrijs());
		b.setTotaal_prijs(m.getPrijs());;

		b.voegMaaltijdToe(m);
		b.setKlant(k);
		b.setRestaurant(r);
		b.setBezorger(be);

		br.save(b);	
	}
	
			
	public List<Bestelling> geefAlleBestellingen() {
		return br.findAll();
	}



}
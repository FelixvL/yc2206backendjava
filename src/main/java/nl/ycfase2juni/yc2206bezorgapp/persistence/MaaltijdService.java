package nl.ycfase2juni.yc2206bezorgapp.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.ycfase2juni.yc2206bezorgapp.model.Maaltijd;

@Service
public class MaaltijdService {
	@Autowired
	MaaltijdRepository mr;

	public void maaltijdInvoeren(Maaltijd m) {
		mr.save(m);
			
	}

	public List<Maaltijd> geefAlleMaaltijden() {
		return mr.findAll();
	}

}

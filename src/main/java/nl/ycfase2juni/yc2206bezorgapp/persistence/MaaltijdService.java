package nl.ycfase2juni.yc2206bezorgapp.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.ycfase2juni.yc2206bezorgapp.model.Maaltijd;

@Service
public class MaaltijdService {
	@Autowired
	MaaltijdRepository mr;

	public void daargaanwe() {
		System.out.println("in de service");
		mr.save(new Maaltijd());
	}
}

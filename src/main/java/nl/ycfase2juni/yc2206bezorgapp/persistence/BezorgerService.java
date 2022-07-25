package nl.ycfase2juni.yc2206bezorgapp.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.ycfase2juni.yc2206bezorgapp.model.Bezorger;

@Service
public class BezorgerService {
	
	@Autowired
	BezorgerRepository ber;

	public Optional<Bezorger> findById(long id) {
		return this.ber.findById(id);
	}
	
	public void bezorgerInvoeren(Bezorger be) {
		ber.save(be);
		
	}
	
	public List<Bezorger> geefAlleBezorgers() {
		return ber.findAll();
	}
	

}
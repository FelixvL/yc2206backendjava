package nl.ycfase2juni.yc2206bezorgapp.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.ycfase2juni.yc2206bezorgapp.model.Bestelling;

@Component
public interface BestellingRepository extends JpaRepository<Bestelling, Long> {

}

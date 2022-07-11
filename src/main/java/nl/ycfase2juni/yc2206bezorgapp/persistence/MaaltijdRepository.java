package nl.ycfase2juni.yc2206bezorgapp.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import nl.ycfase2juni.yc2206bezorgapp.model.Maaltijd;

@Component
public interface MaaltijdRepository extends JpaRepository<Maaltijd, Long> {

}

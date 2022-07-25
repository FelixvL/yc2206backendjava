package nl.ycfase2juni.yc2206bezorgapp.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import nl.ycfase2juni.yc2206bezorgapp.model.Bezorger;

@Component
public interface BezorgerRepository extends JpaRepository<Bezorger, Long> {

}
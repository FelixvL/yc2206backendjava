package nl.ycfase2juni.yc2206bezorgapp.restcontroller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.ycfase2juni.yc2206bezorgapp.model.Maaltijd;

@Component
public interface FelixModelRepository extends CrudRepository<FelixModel, Long> {

}

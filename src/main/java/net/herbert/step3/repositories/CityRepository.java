package net.herbert.step3.repositories;

import net.herbert.step3.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, String> {
}

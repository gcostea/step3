package net.herbert.step3.repositories;

import net.herbert.step3.model.City;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, String> {
}

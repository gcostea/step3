package net.herbert.step3.endpoints;

import net.herbert.step3.model.City;
import net.herbert.step3.repositories.CityRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityEndpoint {

    @GetMapping
    public Iterable<City> getAllCities() {
        return cityRepository.findAll();
    }

    public CityEndpoint(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    private final CityRepository cityRepository;

}

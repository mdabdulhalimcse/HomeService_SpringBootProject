package com.coderbd.serviceimpl;

import com.coderbd.Service.CountryStateCityService;
import com.coderbd.entity.City;
import com.coderbd.entity.Country;
import com.coderbd.entity.State;
import com.coderbd.repository.CityRepo;
import com.coderbd.repository.CountryRepo;
import com.coderbd.repository.StateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CountryStateCityServiceImpl implements CountryStateCityService {

    @Autowired
    private CountryRepo countryRepo;
    @Autowired
    private StateRepo stateRepo;
    @Autowired
    private CityRepo cityRepo;

    @Override
    public Country saveCountry(Country country) {
        country.setUrl(UUID.randomUUID().toString());
this.countryRepo.save(country);
        return country;
    }

    @Override
    public State saveState(State state) {
        state.setUrl(UUID.randomUUID().toString());
this.stateRepo.save(state);
        return state;
    }

    @Override
    public City saveCity(City city) {
        city.setUrl(UUID.randomUUID().toString());
return this.cityRepo.save(city);
    }

    @Override
    public List<Country> findAllCountries() {
        return this.countryRepo.findAll();
    }

    @Override
    public List<State> findAllStates() {
        return this.stateRepo.findAll();
    }

    @Override
    public List<City> findAllCities() {
        return this.cityRepo.findAll();
    }
}

package com.coderbd.Service;

import com.coderbd.entity.City;
import com.coderbd.entity.Country;
import com.coderbd.entity.State;

import java.util.List;


public interface CountryStateCityService {
    Country saveCountry(Country country);

    State saveState(State state);

    City saveCity(City city);

    List<Country> findAllCountries();
    List<State> findAllStates();
    List<City> findAllCities();
}

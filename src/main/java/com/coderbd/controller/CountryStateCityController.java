package com.coderbd.controller;

import com.coderbd.Service.CountryStateCityService;
import com.coderbd.entity.City;
import com.coderbd.entity.Country;
import com.coderbd.entity.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
public class CountryStateCityController {
    private static final Logger LOG = LoggerFactory.getLogger(CountryStateCityController.class);
    @Autowired
    private CountryStateCityService countryStateCityService;
    private City city1;

    @PostMapping("add-country")
    public ResponseEntity<Country> saveCountry(@Valid @RequestBody Country country){
Country country1 = this.countryStateCityService.saveCountry(country);
    LOG.info("Country Data has been save successfully");
return new ResponseEntity<>(country1, HttpStatus.CREATED);
    }
    @PostMapping("add-state")
    public ResponseEntity<State> saveState(@Valid @RequestBody State state){
State state1 = this.countryStateCityService.saveState(state);
        LOG.info("State Data has been save successfully");
return new ResponseEntity<>(state1, HttpStatus.CREATED);
    }
    @PostMapping("add-city")
    public ResponseEntity<City> saveCity(@Valid @RequestBody City city){
City city1 = this.countryStateCityService.saveCity(city);
       LOG.info("City Data has been save successfully");
return new ResponseEntity<>(city1, HttpStatus.CREATED);
    }

    @GetMapping(value = "list-country")
    public ResponseEntity<List<Country>> listCountry(){
        return new ResponseEntity<>(this.countryStateCityService.findAllCountries(),HttpStatus.FOUND);
    }
    @GetMapping(value = "list-state")
    public ResponseEntity<List<State>> listState(){
        return new ResponseEntity<>(this.countryStateCityService.findAllStates(),HttpStatus.FOUND);
    }
    @GetMapping(value = "list-city")
    public ResponseEntity<List<City>> listCity(){
        return new ResponseEntity<>(this.countryStateCityService.findAllCities(),HttpStatus.FOUND);
    }

}

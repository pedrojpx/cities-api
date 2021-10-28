package com.pedrojpx.citiesapi;

import com.pedrojpx.citiesapi.countries.Country;
import com.pedrojpx.citiesapi.countries.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryRepository repo;

    public CountryResource(CountryRepository repository) {
        this.repo = repository;
    }

    @GetMapping
    public Page<Country> countries(Pageable page) {
        return repo.findAll(page);
    }
}

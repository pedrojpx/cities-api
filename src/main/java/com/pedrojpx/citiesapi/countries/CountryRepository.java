package com.pedrojpx.citiesapi.countries;

import com.pedrojpx.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}

package com.github.ademarbarreto.citiesapi.country.repository;

import com.github.ademarbarreto.citiesapi.country.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

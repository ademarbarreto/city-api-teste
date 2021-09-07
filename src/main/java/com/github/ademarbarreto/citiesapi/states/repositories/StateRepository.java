package com.github.ademarbarreto.citiesapi.states.repositories;
import com.github.ademarbarreto.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}

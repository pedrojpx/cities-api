package com.pedrojpx.citiesapi.states;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateController {

    private StateRepository repository;

    public StateController(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<State> states(final Pageable page) {
        return repository.findAll(page);
    }
}

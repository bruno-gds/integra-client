package com.vip.controller;

import com.vip.controller.json.IntegraJson;
import com.vip.repository.IntegraRepository;
import com.vip.domain.Integra;
import com.vip.useCase.IntegraUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 03/07/2023
 * Project Name: integra-client
 */

@RestController
@RequestMapping("/integra")
public class IntegraController {

    @Autowired
    private IntegraUseCase integraUseCase;

    @GetMapping
    public Set<Integra> findAll() {
        return integraUseCase.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Integra create(@RequestBody IntegraJson integraJson) {
        return integraUseCase.save(integraJson);
    }
}

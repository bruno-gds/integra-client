package com.vip.repository;

import com.vip.controller.json.IntegraJson;
import com.vip.domain.Integra;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 03/07/2023
 * Project Name: integra-client
 */

@Repository
public class IntegraRepository {

    private final Set<Integra> integraSet;

    public IntegraRepository() {
        integraSet = new HashSet<>();
    }

    public void save(Integra data) {
        integraSet.add(data);
    }

    public Set<Integra> findAll() {
        return integraSet;
    }
}

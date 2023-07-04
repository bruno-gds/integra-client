package com.vip.useCase;

import com.vip.controller.json.IntegraJson;
import com.vip.domain.Integra;
import com.vip.repository.IntegraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 03/07/2023
 * Project Name: integra-client
 */

@Service
public class IntegraUseCase {

    @Autowired
    private IntegraRepository integraRepository;

    public Integra save(IntegraJson integra) {
        Integra data = new Integra();
        data.setCalldate(integra.getCalldate());
        data.setSrc(integra.getSrc());
        data.setDst(integra.getDst());
        data.setDuration(integra.getDuration());
        data.setBillsec(integra.getBillsec());
        data.setDisposition(integra.getDisposition());
        data.setUserfield(integra.getUserfield());
        data.setAccountcode(integra.getAccountcode());
        data.setPrice(integra.getPrice());

        integraRepository.save(data);

        return data;
    }

    public Set<Integra> findAll(){
        return integraRepository.findAll();
    }
}

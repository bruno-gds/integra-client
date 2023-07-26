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

    public Integra save(IntegraJson integraJson) {
        Integra data = new Integra();
        data.setOrg(integraJson.getOrg());
        data.setDst(integraJson.getDst());
        data.setStart(integraJson.getStart());
        data.setDisposition(integraJson.getDisposition());
        data.setUniqueid(integraJson.getUniqueid());
        data.setUserfield(integraJson.getUserfield());
        data.setAccountcode(integraJson.getAccountcode());
        data.setEmp(integraJson.getEmp());
        data.setDuration(integraJson.getDuration());
        data.setBillsec(integraJson.getBillsec());
        data.setUrlRecord(integraJson.getUrlRecord());
        data.setPrice(integraJson.getPrice());

        integraRepository.save(data);

        return data;
    }

    public Set<Integra> findAll() {
        return integraRepository.findAll();
    }

    public void clearSet() {
        integraRepository.clear();
    }
}

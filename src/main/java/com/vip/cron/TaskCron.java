package com.vip.cron;

import com.vip.useCase.IntegraUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 26/07/2023
 * Project Name: integra-client
 */

@Component
public class TaskCron {

    @Autowired
    private IntegraUseCase integraUseCase;

    @Scheduled(cron = "00 00 02 * * *") // diario
    public void clean() {
        integraUseCase.clearSet();
    }
}

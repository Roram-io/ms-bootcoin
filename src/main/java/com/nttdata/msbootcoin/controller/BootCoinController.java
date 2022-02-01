package com.nttdata.msbootcoin.controller;

import com.nttdata.msbootcoin.model.BootCoinTransaction;
import com.nttdata.msbootcoin.model.BootCoinUser;
import com.nttdata.msbootcoin.service.BootCoinService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/bootcoin")
public class BootCoinController {

    @Autowired
    BootCoinService bootCoinService;

    Logger log = LoggerFactory.getLogger(BootCoinController.class);

    @PostMapping
    public Mono<BootCoinUser> createBootCoinUser(BootCoinUser bootCoinUser){
        return bootCoinService.createBootCoinUser(bootCoinUser);
    }

    @PutMapping
    public Mono<BootCoinUser> updateBootCoinUser(BootCoinUser bootCoinUser){
        return bootCoinService.updateBootCoinUser(bootCoinUser);
    }

    @GetMapping
    public Mono<BootCoinUser> getBootCoinUser(String id){
        return bootCoinService.getBootCoinUser(id);
    }

    @PostMapping
    public Mono<BootCoinTransaction> handleTransaction(BootCoinTransaction bootCoinTransaction){
        return bootCoinService.handleTransaction(bootCoinTransaction);
    }
}

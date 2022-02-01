package com.nttdata.msbootcoin.service;

import com.nttdata.msbootcoin.model.BootCoinTransaction;
import com.nttdata.msbootcoin.model.BootCoinUser;
import reactor.core.publisher.Mono;

public interface BootCoinService {
    Mono<BootCoinUser> createBootCoinUser(BootCoinUser bootCoinUser);

    Mono<BootCoinUser> updateBootCoinUser(BootCoinUser bootCoinUser);

    Mono<BootCoinUser> getBootCoinUser(String id);

    Mono<BootCoinTransaction> handleTransaction(BootCoinTransaction bootCoinTransaction);


}

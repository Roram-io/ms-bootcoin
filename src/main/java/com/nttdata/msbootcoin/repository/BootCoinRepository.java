package com.nttdata.msbootcoin.repository;

import com.nttdata.msbootcoin.model.BootCoinUser;
import com.nttdata.msbootcoin.service.BootCoinService;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BootCoinRepository extends ReactiveMongoRepository<BootCoinUser, String> {
}

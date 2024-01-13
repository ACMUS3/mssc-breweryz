package com.acmus.msscbreweryz.web.service;

import com.acmus.msscbreweryz.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy 001")
                .beerStyle("Pale 001")
                .upc(59898595265L)
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        BeerDto.builder()
                .id(beerId)
                .build();
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.debug("Deleting a beer.");
    }
}

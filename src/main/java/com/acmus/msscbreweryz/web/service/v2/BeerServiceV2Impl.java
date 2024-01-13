package com.acmus.msscbreweryz.web.service.v2;

import com.acmus.msscbreweryz.web.model.BeerDto;
import com.acmus.msscbreweryz.web.model.v2.BeerDtoV2;
import com.acmus.msscbreweryz.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy 001")
                .beerStyle(BeerStyleEnum.GOSE)
                .upc(59898595265L)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDto beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        BeerDtoV2.builder()
                .id(beerId)
                .build();

    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.debug("Deleting a beer.");


    }
}

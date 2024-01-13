package com.acmus.msscbreweryz.web.service.v2;

import com.acmus.msscbreweryz.web.model.BeerDto;
import com.acmus.msscbreweryz.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteBeerById(UUID beerId);
}

package harley755.springboot.mcsc_brewery.services.v2;

import java.util.UUID;

import org.springframework.stereotype.Service;

import harley755.springboot.mcsc_brewery.web.model.v2.BeerDtoV2;

@Service
public interface BeerServiceV2 {

    BeerDtoV2 getBeerById(UUID id);

    BeerDtoV2 createBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID id, BeerDtoV2 beerDto);

    void deleteBeerById(UUID id);

}

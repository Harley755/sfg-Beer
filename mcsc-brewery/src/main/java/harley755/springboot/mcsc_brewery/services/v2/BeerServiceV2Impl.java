package harley755.springboot.mcsc_brewery.services.v2;

import java.util.UUID;

import org.springframework.stereotype.Service;

import harley755.springboot.mcsc_brewery.web.model.v2.BeerDtoV2;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(beerId)
                .beername("Galaxy Cat")
                
                .upc(123456789012L)
                .build();
    }

    @Override
    public BeerDtoV2 createBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
            .id(beerDto.getId())
            .build();
    }

    @Override
    public void updateBeer(UUID id, BeerDtoV2 beerDto) {
        
    }

    @Override
    public void deleteBeerById(UUID id) {
        log.debug("Deleting a beer !");
    }
    
}

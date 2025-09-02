package harley755.springboot.mcsc_brewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import harley755.springboot.mcsc_brewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;


@Slf4j // Inject log.debug()
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(beerId)
                .beername("Galaxy Cat")
                .beerStyle("Pale Ale")
                .upc(123456789012L)
                .build();
    }

    @Override
    public BeerDto createBeer(BeerDto beerDto) {
        return BeerDto.builder()
            .id(beerDto.getId())
            .build();
    }

    @Override
    public void updateBeer(UUID id, BeerDto beerDto) {
        
    }

    @Override
    public void deleteBeerById(UUID id) {
        log.debug("Deleting a beer !");
    }   
}

package harley755.springboot.mcsc_brewery.services;

import org.springframework.stereotype.Service;

import harley755.springboot.mcsc_brewery.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(java.util.UUID beerId) {
        return BeerDto.builder()
                .id(beerId)
                .beername("Galaxy Cat")
                .beerStyle("Pale Ale")
                .upc(123456789012L)
                .build();
    }   
}

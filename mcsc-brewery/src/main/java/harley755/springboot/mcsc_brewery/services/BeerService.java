package harley755.springboot.mcsc_brewery.services;

import org.springframework.stereotype.Service;

import harley755.springboot.mcsc_brewery.web.model.BeerDto;

@Service
public interface BeerService {
    BeerDto getBeerById(java.util.UUID beerId);
}

package harley755.spring_boot.mssc_beer_service.mappers;

import org.mapstruct.Mapper;

import harley755.spring_boot.mssc_beer_service.domain.Beer;
import harley755.spring_boot.mssc_beer_service.model.BeerDto;

@Mapper(uses = DateMapper.class)
public interface BeerMappers {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}

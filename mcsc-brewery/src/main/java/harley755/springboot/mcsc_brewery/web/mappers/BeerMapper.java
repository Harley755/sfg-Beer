package harley755.springboot.mcsc_brewery.web.mappers;

import org.mapstruct.Mapper;

import harley755.springboot.mcsc_brewery.domain.Beer;
import harley755.springboot.mcsc_brewery.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}

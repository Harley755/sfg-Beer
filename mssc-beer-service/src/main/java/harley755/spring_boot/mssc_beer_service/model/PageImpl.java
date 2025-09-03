package harley755.spring_boot.mssc_beer_service.model;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

public class PageImpl<T> {

    public PageImpl(List<BeerDto> content, Pageable pageable, long total) {
        
    }

    public PageImpl(List<BeerDto> content) {
        
    }

}

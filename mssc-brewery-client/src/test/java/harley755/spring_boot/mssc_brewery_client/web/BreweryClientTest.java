package harley755.spring_boot.mssc_brewery_client.web;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.net.URI;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import harley755.spring_boot.mssc_brewery_client.brewery_client.BreweryClient;
import harley755.spring_boot.mssc_brewery_client.web.model.BeerDto;

@SpringBootTest
public class BreweryClientTest {
    
    @Autowired
    BreweryClient client;

    @Test
    void getBeerById() {
        BeerDto dto = client.getBeerById(UUID.randomUUID());

        assertNotNull(dto);
    }

    @Test
    void postBeer() {
        BeerDto beerDto = BeerDto.builder().beerName("New beer").build();

        URI uri = client.saveNewBeer(beerDto);

        assertNotNull(uri);

        System.out.println(uri.toString());
    }

    @Test
    void updateBeer() {
        BeerDto beerDto = BeerDto.builder().beerName("New beer").build();
        
        client.updateBeer(UUID.randomUUID(), beerDto);
    }
    
    @Test
    void deleteBeer() {
        client.deleted(UUID.randomUUID());
    }
}

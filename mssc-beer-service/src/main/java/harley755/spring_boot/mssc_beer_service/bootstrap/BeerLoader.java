package harley755.spring_boot.mssc_beer_service.bootstrap;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import harley755.spring_boot.mssc_beer_service.domain.Beer;
import harley755.spring_boot.mssc_beer_service.repositories.BeerRepository;

@Component
public class BeerLoader implements CommandLineRunner {

    private BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        LoadBeerObjects();
    }

    private void LoadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(
                Beer.builder()
                .beer_name("Mango Bobs")
                .beer_style("IPA")
                .quantity_to_brew(200)
                .min_on_hand(12)
                .upc(1333123790L)
                .price(new BigDecimal("12.95"))
                .build());

            beerRepository.save(
                Beer.builder()
                .beer_name("Galaxy Cat")
                .beer_style("PALE_ALE")
                .quantity_to_brew(200)
                .min_on_hand(12)
                .upc(2333123790L)
                .price(new BigDecimal("120.95"))
                .build());

            beerRepository.save(
                Beer.builder()
                .beer_name("Mango Bobs 3")
                .beer_style("IPA3")
                .quantity_to_brew(20000)
                .min_on_hand(1200)
                .upc(333123790L)
                .price(new BigDecimal("1200.95"))
                .build());
        }


        System.out.println("Loader Beers : " + beerRepository.count());
    }
    
}

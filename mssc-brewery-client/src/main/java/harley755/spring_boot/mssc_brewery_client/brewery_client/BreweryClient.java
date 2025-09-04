package harley755.spring_boot.mssc_brewery_client.brewery_client;

import java.net.URI;
import java.util.UUID;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import harley755.spring_boot.mssc_brewery_client.web.model.BeerDto;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

@Component
@ConfigurationProperties(prefix = "sfg.brewery", ignoreUnknownFields = false)
public class BreweryClient {
    private String apiHost;

    public final String BEER_PATH_V1 = "/api/v1/beer";
    private final RestTemplate restTemplate;

    

    public BreweryClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public BeerDto getBeerById(UUID uuid) {
        return restTemplate.getForObject(apiHost + BEER_PATH_V1 + '/' + uuid.toString(), BeerDto.class);
    }

    public URI saveNewBeer(BeerDto beerDto) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<BeerDto> request = new HttpEntity<>(beerDto, headers);

        return restTemplate.postForLocation(apiHost + BEER_PATH_V1, request);
    }

    public void updateBeer(UUID uuid, BeerDto beerDto) {
        restTemplate.put(apiHost + BEER_PATH_V1 + "/" + uuid.toString(), beerDto);
    }

    public void deleted(UUID uuid) {
        restTemplate.delete(apiHost + BEER_PATH_V1 + "/" + uuid.toString());
    }

    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }
}

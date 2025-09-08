package harley755.spring_boot.mssc_beer_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import harley755.spring_boot.mssc_beer_service.model.BeerDto;
import harley755.spring_boot.mssc_beer_service.service.BeerService;

import java.net.URI;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
    
    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }


    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> show(@PathVariable("beerId") UUID id) {
        
        // IMPL
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }


    @PostMapping()
    public ResponseEntity<Void> create(@RequestBody @Validated BeerDto beerDto) {

        URI location = URI.create("/api/v1/beer/" + UUID.randomUUID());
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<Void> update(@PathVariable("beerId") UUID id, @RequestBody @Validated BeerDto beerDto) {

        // IMPL
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    @DeleteMapping("/{beerId}") 
    public ResponseEntity<Void> delete(@PathVariable("beerId") UUID id) {

        // IMPL
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    
}

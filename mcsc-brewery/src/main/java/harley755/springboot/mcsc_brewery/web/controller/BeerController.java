package harley755.springboot.mcsc_brewery.web.controller;

import java.net.URI;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import harley755.springboot.mcsc_brewery.services.BeerService;
import harley755.springboot.mcsc_brewery.web.model.BeerDto;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@Deprecated
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> showBeer(@PathVariable("beerId") UUID id) {
        return new ResponseEntity<>(
                beerService.getBeerById(id),
                HttpStatus.OK);
    }
    
   @PostMapping
    public ResponseEntity<Void> createBeer (@Valid @RequestBody BeerDto beerDto) {
        BeerDto saved = beerService.createBeer(beerDto);

        return ResponseEntity
                .created(URI.create("/api/v1/beer/" + saved.getId().toString()))
                .build();
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<Void> updateBeer(@PathVariable("beerId") UUID id, @Valid @RequestBody BeerDto beerDto) {
        beerService.updateBeer(id, beerDto);

        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void destroyBeer(@PathVariable("beerId") UUID id) {
        beerService.deleteBeerById(id);
    }
    
    
}

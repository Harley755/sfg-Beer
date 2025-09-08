package harley755.springboot.mcsc_brewery.web.controller.v2;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import harley755.springboot.mcsc_brewery.services.v2.BeerServiceV2;
import harley755.springboot.mcsc_brewery.web.model.v2.BeerDtoV2;

import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;


@Validated
@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {
    private final BeerServiceV2 beerService;

    public BeerControllerV2(BeerServiceV2 beerService) { this.beerService = beerService; }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> showBeer(@NotNull @PathVariable("beerId") UUID id) {
        return new ResponseEntity<>(
                beerService.getBeerById(id),
                HttpStatus.OK);
    }
    
   @PostMapping
    public ResponseEntity<Void> createBeer(@Valid @NotNull @RequestBody BeerDtoV2 beerDto) {
        BeerDtoV2 saved = beerService.createBeer(beerDto);

        return ResponseEntity
                .created(URI.create("/api/v1/beer/" + saved.getId().toString()))
                .build();
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<Void> updateBeer(@PathVariable("beerId") UUID id, @RequestBody BeerDtoV2 beerDto) {
        beerService.updateBeer(id, beerDto);

        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void destroyBeer(@PathVariable("beerId") UUID id) {
        beerService.deleteBeerById(id);
    }
}

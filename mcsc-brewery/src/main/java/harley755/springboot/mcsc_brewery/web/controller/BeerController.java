package harley755.springboot.mcsc_brewery.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import harley755.springboot.mcsc_brewery.services.BeerService;
import harley755.springboot.mcsc_brewery.web.model.BeerDto;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService bearService;

    public BeerController(BeerService bearService) {
        this.bearService = bearService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> show(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(
           bearService.getBeerById(beerId), 
            HttpStatus.OK
        );
    }
}

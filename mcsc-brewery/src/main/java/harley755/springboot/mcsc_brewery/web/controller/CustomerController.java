package harley755.springboot.mcsc_brewery.web.controller;

import java.net.URI;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import harley755.springboot.mcsc_brewery.services.CustomerService;
import harley755.springboot.mcsc_brewery.web.model.CustomerDto;
import io.micrometer.common.lang.NonNull;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@Validated
@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@Valid @NonNull @PathVariable("customerId") UUID id) {
        return new ResponseEntity<>(
                customerService.getCustomerById(id),
                HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> createCustomer(@Valid @RequestBody CustomerDto customerDto) {

        CustomerDto saved = customerService.createCustomer(customerDto);

        return ResponseEntity
                .created(URI.create("/api/v1/customer/" + saved.getId().toString()))
                .build();
    }
    
    @PutMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomer(@PathVariable("customerId") UUID id, @RequestBody @Valid CustomerDto customerDto) {
        customerService.updateCustomer(id, customerDto);
    }
    

    @DeleteMapping("/{customerId}")
    public void destroyCustomer(@PathVariable("customerId") UUID id) {
        customerService.deleteCustomerById(id);
    }    
}

package harley755.springboot.mcsc_brewery.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import harley755.springboot.mcsc_brewery.services.CustomerService;
import harley755.springboot.mcsc_brewery.web.model.CustomerDto;
import org.springframework.web.bind.annotation.GetMapping;


@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID id) {
        return new ResponseEntity<>(
                customerService.getCustomerById(id),
                HttpStatus.OK);
    }
    
    
}

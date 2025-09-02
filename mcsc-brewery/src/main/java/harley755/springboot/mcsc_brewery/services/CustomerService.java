package harley755.springboot.mcsc_brewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import harley755.springboot.mcsc_brewery.web.model.CustomerDto;

@Service
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}

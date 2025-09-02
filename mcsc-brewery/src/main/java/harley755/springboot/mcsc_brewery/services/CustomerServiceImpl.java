package harley755.springboot.mcsc_brewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import harley755.springboot.mcsc_brewery.web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        
        return CustomerDto
            .builder()
            .id(customerId)
            .name("John DOE")
            .build();
    }
    
}

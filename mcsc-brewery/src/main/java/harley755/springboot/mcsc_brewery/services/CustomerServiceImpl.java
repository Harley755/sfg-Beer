package harley755.springboot.mcsc_brewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import harley755.springboot.mcsc_brewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
            .id(customerDto.getId())
            .build();
    }

    @Override
    public void updateCustomer(UUID id, CustomerDto customerDto) {
        
    }

    @Override
    public void deleteCustomerById(UUID id) {
        log.debug("Deleting a customer !");
    }
    
}

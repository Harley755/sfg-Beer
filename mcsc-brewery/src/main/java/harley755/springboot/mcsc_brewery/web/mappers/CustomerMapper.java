package harley755.springboot.mcsc_brewery.web.mappers;

import org.mapstruct.Mapper;

import harley755.springboot.mcsc_brewery.domain.Customer;
import harley755.springboot.mcsc_brewery.web.model.CustomerDto;

@Mapper
public interface CustomerMapper {
    
    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}

package harley755.springboot.mcsc_brewery.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode methods
@NoArgsConstructor // Lombok annotation to generate a no-argument constructor
@AllArgsConstructor // Lombok annotation to generate a constructor with all arguments
@Builder // Lombok annotation to implement the builder pattern
public class BeerDto {
    private UUID id;
    private String beername;
    private String beerStyle;
    private Long upc; // Universal Product Code
}

package harley755.springboot.mcsc_brewery.web.model;

import java.time.OffsetDateTime;
import java.util.UUID;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode methods
@NoArgsConstructor // Lombok annotation to generate a no-argument constructor
@AllArgsConstructor // Lombok annotation to generate a constructor with all arguments
@Builder // Lombok annotation to implement the builder pattern
public class BeerDto {

    @Null
    private UUID id;

    @NotBlank
    private String beername;

    @NotBlank
    private String beerStyle;

    @Positive
    private Long upc; // Universal Product Code

    private OffsetDateTime created_at;
    private OffsetDateTime updated_at;
}

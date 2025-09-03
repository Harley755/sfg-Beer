package harley755.springboot.mcsc_brewery.web.model.v2;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 {
    private UUID id;
    private String beername;
    private BeerStyleEnum beerStyle;
    private Long upc;
}

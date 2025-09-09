package harley755.springboot.mcsc_brewery.domain;

import java.sql.Timestamp;
import java.util.UUID;

import harley755.springboot.mcsc_brewery.web.model.v2.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Beer {
    private UUID id;
    private String beername;
    private BeerStyleEnum beerStyle;
    private Long upc;

    private Timestamp created_at;
    private Timestamp updated_at;
    
}

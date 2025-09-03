package harley755.spring_boot.mssc_beer_service.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private Integer version;

    private OffsetDateTime created_at;
    private OffsetDateTime updated_at;

    private String beer_name;
    private BeerStyleEnum beer_style;

    private Long upc;

    private BigDecimal price;

    private Integer quantity_on_hand;

}

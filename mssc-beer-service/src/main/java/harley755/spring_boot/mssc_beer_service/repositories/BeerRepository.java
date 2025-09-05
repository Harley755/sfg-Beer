package harley755.spring_boot.mssc_beer_service.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import harley755.spring_boot.mssc_beer_service.domain.Beer;

public interface BeerRepository extends JpaRepository<Beer, UUID> {
}

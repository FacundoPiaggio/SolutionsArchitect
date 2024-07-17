package Challenge.SolutionsArchitect.persistence.repositorys;

import Challenge.SolutionsArchitect.domain.house.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HouseRepository extends JpaRepository<House, UUID> {
}

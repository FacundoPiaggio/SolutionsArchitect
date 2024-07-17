package Challenge.SolutionsArchitect.service.house;

import Challenge.SolutionsArchitect.domain.house.House;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface houseService {

    public List<House> housesList();

    public Optional<House> getHouseById(UUID id);

    public House saveHouse(House house);
}

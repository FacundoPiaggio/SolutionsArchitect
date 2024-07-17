package Challenge.SolutionsArchitect.service.house;

import Challenge.SolutionsArchitect.domain.house.House;
import Challenge.SolutionsArchitect.persistence.repositorys.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class HouseServiceImpl implements houseService{

    @Autowired
    private HouseRepository repository;

    @Override
    public List<House> housesList() {
        return repository.findAll();
    }

    @Override
    public Optional<House> getHouseById(UUID id) {
        return repository.findById(id);
    }

    @Override
    public House saveHouse(House house) {
        return repository.save(house);
    }
}

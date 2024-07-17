package Challenge.SolutionsArchitect.service.wizardAPI.adapter;

import Challenge.SolutionsArchitect.domain.house.House;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public interface AdapterWizardAPI {

    public List<House> getHousesList() throws IOException;
    public House getHouseByID(UUID id) throws IOException;
}

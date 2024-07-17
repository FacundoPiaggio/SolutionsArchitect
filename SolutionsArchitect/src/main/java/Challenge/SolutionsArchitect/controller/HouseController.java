package Challenge.SolutionsArchitect.controller;

import Challenge.SolutionsArchitect.domain.house.House;
import Challenge.SolutionsArchitect.service.house.HouseServiceImpl;
import Challenge.SolutionsArchitect.service.wizardAPI.service.ServiceWizardApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Controller
public class HouseController {

    @Autowired
    private HouseServiceImpl houseService;

    @Autowired
    private ServiceWizardApi wizardApi;

    @GetMapping("/houses")
    public String housesList(Model model) throws IOException {

        List<House> houses = houseService.housesList();
        if(houses.isEmpty()){
            List<House> wizardHouses = wizardApi.getHousesList();
            for(House house : wizardHouses){
                houseService.saveHouse(house);
            }
            houses = wizardHouses;
        }

        model.addAttribute("houses", houses);

        return "houses";
    }

    @GetMapping("/house/{uuid}")
    public String showHouse(Model model, @PathVariable UUID uuid){
        Optional<House> houseOpt = houseService.getHouseById(uuid);
        House house = houseOpt.get();
        model.addAttribute("house", (House) house);
        return "house";
    }
}

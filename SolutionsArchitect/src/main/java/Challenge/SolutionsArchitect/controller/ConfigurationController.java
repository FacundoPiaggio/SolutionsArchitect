package Challenge.SolutionsArchitect.controller;

import Challenge.SolutionsArchitect.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
//@ComponentScan(basePackages = "com.proyecto")
public class ConfigurationController {
    @Autowired
    private Configuration config;

    public ConfigurationController(){
    }

    @GetMapping("/config")
    public Map<String, String> imprimirProperties(){
        return Map.of
                ("DB_PUERTO", config.getPuerto(),
                        "DB_HOST", config.getHost(),
                        "DB_NOMBRE", config.getNombre(),
                        "DB_USUARIO", config.getUsuario(),
                        "DB_PASSWORD", config.getPassword(),
                        "amplitude.api.key",config.getAmplitudekey());
    }

    @GetMapping("/amplitudekey")
    public String amplitude(){
        return config.getAmplitudekey();
    }
}

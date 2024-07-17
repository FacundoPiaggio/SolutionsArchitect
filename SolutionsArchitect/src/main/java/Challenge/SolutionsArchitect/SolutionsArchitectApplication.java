package Challenge.SolutionsArchitect;

import Challenge.SolutionsArchitect.configuration.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.io.IOException;

@SpringBootApplication
@EnableConfigurationProperties(Configuration.class)
public class SolutionsArchitectApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SolutionsArchitectApplication.class, args);
	}
	
}

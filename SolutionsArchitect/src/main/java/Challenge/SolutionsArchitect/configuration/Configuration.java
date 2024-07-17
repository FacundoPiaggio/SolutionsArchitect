package Challenge.SolutionsArchitect.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Setter
@Getter
@ConfigurationProperties("configuration")
public class Configuration {

    @Value("${amplitude.api.key}")
    private String amplitudekey;

    @Value("${DB_PUERTO}")
    private String puerto;

    @Value("${DB_HOST}")
    private String host;

    @Value("${DB_NOMBRE}")
    private String nombre;

    @Value("${DB_USUARIO}")
    private String usuario;

    @Value("${DB_PASSWORD}")
    private String password;

    public Configuration(String puerto, String host, String nombre, String usuario, String password, String amplitudekey) {
        this.puerto = puerto;
        this.host = host;
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
        this.amplitudekey = amplitudekey;
    }
}

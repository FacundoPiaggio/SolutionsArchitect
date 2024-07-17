package Challenge.SolutionsArchitect.domain.house;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "trait")
public class Trait {

    @Id
    @Getter
    private UUID id;

    @Getter @Setter
    private String name;
}

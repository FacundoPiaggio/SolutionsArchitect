package Challenge.SolutionsArchitect.domain.person;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @Getter
    private UUID id;

    @Getter @Setter
    private String firstName;

    @Getter @Setter
    private String lastName;
}

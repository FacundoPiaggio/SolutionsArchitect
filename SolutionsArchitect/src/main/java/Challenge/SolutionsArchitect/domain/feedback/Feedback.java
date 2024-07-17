package Challenge.SolutionsArchitect.domain.feedback;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "feedback")
@Getter @Setter
public class Feedback {

    @Id
    private Integer id;

    private String name;

    private String email;

    private String feedback;

    public Feedback(){};
}

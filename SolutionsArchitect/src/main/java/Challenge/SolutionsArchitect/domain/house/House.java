package Challenge.SolutionsArchitect.domain.house;

import Challenge.SolutionsArchitect.domain.person.Person;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "house")
public class House {

    @Id
    @Getter
    private UUID id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String houseColours;

    @Getter @Setter
    private String founder;

    @Getter @Setter
    private String animal;

    @Getter @Setter
    private String element;

    @Getter @Setter
    private String ghost;

    @Getter @Setter
    private String commonRoom;

    @Getter
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "head_id")
    private List<Person> heads;

    @Getter
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "trait_id")
    private List<Trait> traits;


    public House(){
        this.heads = new ArrayList<>();
        this.traits = new ArrayList<>();
    }

    public void addHead(Person head){
        this.heads.add(head);
    }

    public void addTrait(Trait trait){
        this.traits.add(trait);
    }

}


package Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "planets")

public class Planeter implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY )
    @Column(name="id")
    private String planetId;

    @Column(name="details")
    private String planetDetails;

    public Planeter() {
    }

    public String getPlanetId() {
        return planetId;
    }

    public void setPlanetId(String planetId) {
        this.planetId = planetId;
    }

    public String getPlanetDetails() {
        return planetDetails;
    }

    public void setPlanetDetails(String planetDetails) {
        this.planetDetails = planetDetails;
    }
}

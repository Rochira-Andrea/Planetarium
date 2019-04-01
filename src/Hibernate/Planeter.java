package Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "planets")

public class Planeter implements Serializable {

    @Id
    @Column(name="id")
    private String planetId;

    @Column(name="details")
    private String planetDetails;

    public Planeter() {
    }

    public Planeter(String planetId, String planetDetails) {
        this.planetId = planetId;
        this.planetDetails = planetDetails;
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

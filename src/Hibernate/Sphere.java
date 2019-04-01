package Hibernate;

import java.io.Serializable;

public class Sphere implements Serializable {

    // attributes
    private String name;
    private String volume;
    private String orbitalPeriod;
    private String satellite;
    private String habitable;

    public Sphere() {
    }

    public Sphere(String name, String volume, String orbitalPeriod, String satellite, String habitable) {
        this.name = name;
        this.volume = volume;
        this.orbitalPeriod = orbitalPeriod;
        this.satellite = satellite;
        this.habitable = habitable;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public String getSatellite() {
        return satellite;
    }

    public void setSatellite(String satellite) {
        this.satellite = satellite;
    }

    public String getHabitable() {
        return habitable;
    }

    public void setHabitable(String habitable) {
        this.habitable = habitable;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "name='" + name + '\'' +
                ", volume='" + volume + '\'' +
                ", orbitalPeriod=" + orbitalPeriod +
                ", satellite=" + satellite +
                ", habitable='" + habitable + '\'' +
                '}';
    }
}

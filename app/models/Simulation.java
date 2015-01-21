package models;

import java.util.List;

/**
 * Created by Javier Isoldi.
 * Date: 14/01/15.
 * Project: simulation-io.
 */
public class Simulation {
    private Double duration;
    private List<Person> persons;

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}

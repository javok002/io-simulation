package models;

/**
 * Created by Javier Isoldi.
 * Date: 14/01/15.
 * Project: simulation-io.
 */
public class Person {
    private String name;
    private Double arrival;
    private Double service;
    private Boolean hasAbsolutePriority;
    private Boolean hasTolerance;
    private Boolean hasReset;
    private Boolean hasTotalDesertion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getArrival() {
        return arrival;
    }

    public void setArrival(Double arrival) {
        this.arrival = arrival;
    }

    public Double getService() {
        return service;
    }

    public void setService(Double service) {
        this.service = service;
    }

    public Boolean getHasAbsolutePriority() {
        return hasAbsolutePriority;
    }

    public void setHasAbsolutePriority(Boolean hasAbsolutePriority) {
        this.hasAbsolutePriority = hasAbsolutePriority;
    }

    public Boolean getHasTolerance() {
        return hasTolerance;
    }

    public void setHasTolerance(Boolean hasTolerance) {
        this.hasTolerance = hasTolerance;
    }

    public Boolean getHasReset() {
        return hasReset;
    }

    public void setHasReset(Boolean hasReset) {
        this.hasReset = hasReset;
    }

    public Boolean getHasTotalDesertion() {
        return hasTotalDesertion;
    }

    public void setHasTotalDesertion(Boolean hasTotalDesertion) {
        this.hasTotalDesertion = hasTotalDesertion;
    }
}

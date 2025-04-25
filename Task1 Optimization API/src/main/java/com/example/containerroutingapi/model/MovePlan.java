package com.example.containerroutingapi.model;

public class MovePlan {

    private Integer container;
    private Integer destination;

    // Constructor
    public MovePlan(Integer container, Integer destination) {
        this.container = container;
        this.destination = destination;
    }

    // Getters and Setters
    public Integer getContainer() {
        return container;
    }

    public void setContainer(Integer container) {
        this.container = container;
    }

    public Integer getDestination() {
        return destination;
    }

    public void setDestination(Integer destination) {
        this.destination = destination;
    }
}

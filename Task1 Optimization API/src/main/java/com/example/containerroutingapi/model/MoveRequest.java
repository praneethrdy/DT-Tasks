package com.example.containerroutingapi.model;

import java.util.List;

public class MoveRequest {

    private List<Integer> containers;
    private List<Integer> destinations;
    private List<List<Double>> costMatrix;

    // Getters and Setters

    public List<Integer> getContainers() {
        return containers;
    }

    public void setContainers(List<Integer> containers) {
        this.containers = containers;
    }

    public List<Integer> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Integer> destinations) {
        this.destinations = destinations;
    }

    public List<List<Double>> getCostMatrix() {
        return costMatrix;
    }

    public void setCostMatrix(List<List<Double>> costMatrix) {
        this.costMatrix = costMatrix;
    }
}

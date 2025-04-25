package com.example.containerroutingapi.service;

import com.example.containerroutingapi.model.MovePlan;
import com.example.containerroutingapi.model.MoveRequest;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RoutingService {

    public List<MovePlan> calculateOptimalMoves(MoveRequest request) {
        List<Integer> containers = request.getContainers();
        List<Integer> destinations = request.getDestinations();
        List<List<Double>> costMatrix = request.getCostMatrix();

        List<MovePlan> movePlans = new ArrayList<>();
        Set<Integer> usedDestinations = new HashSet<>();

        for (int i = 0; i < containers.size(); i++) {
            double minCost = Double.MAX_VALUE;
            int chosenDestination = -1;

            for (int j = 0; j < destinations.size(); j++) {
                if (usedDestinations.contains(j)) continue;

                double cost = costMatrix.get(i).get(j);
                if (cost < minCost) {
                    minCost = cost;
                    chosenDestination = j;
                }
            }

            if (chosenDestination != -1) {
                usedDestinations.add(chosenDestination);
                movePlans.add(new MovePlan(containers.get(i), destinations.get(chosenDestination)));
            }
        }

        return movePlans;
    }
}

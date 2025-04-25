package com.example.containerroutingapi.controller;

import com.example.containerroutingapi.model.MovePlan;
import com.example.containerroutingapi.model.MoveRequest;
import com.example.containerroutingapi.service.RoutingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/route")
@CrossOrigin
public class RoutingController {

    @Autowired
    private RoutingService routingService;

    @PostMapping
    public List<MovePlan> optimizeRoute(@RequestBody MoveRequest request) {
        long startTime = System.nanoTime();
        List<MovePlan> result = routingService.calculateOptimalMoves(request);
        long endTime = System.nanoTime();

        System.out.println("Latency: " + (endTime - startTime) / 1_000_000.0 + " ms");
        return result;
    }
}

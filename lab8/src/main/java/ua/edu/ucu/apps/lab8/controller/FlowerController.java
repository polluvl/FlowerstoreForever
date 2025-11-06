package ua.edu.ucu.apps.lab8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab8.model.Flower;
import ua.edu.ucu.apps.lab8.service.FlowerService;

@RestController
public class FlowerController {
    private FlowerService flowerservice;

    @Autowired
    public FlowerController(FlowerService flowerService){
        this.flowerservice = flowerService;
    }

    @GetMapping("/flowers")
    public List<Flower> getFlowers() {
        return flowerservice.getFlowers();
    }
}

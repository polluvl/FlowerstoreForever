package ua.edu.ucu.apps.lab8.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.edu.ucu.apps.lab8.model.Flower;
import ua.edu.ucu.apps.lab8.repository.FlowerRepository;

@Service
public class FlowerService {

    private FlowerRepository flowerrepository;

    @Autowired
    public FlowerService(FlowerRepository repository) {
        this.flowerrepository = repository;
    }
    public List<Flower> getFlowers() {
        return flowerrepository.findAll();
    }
}

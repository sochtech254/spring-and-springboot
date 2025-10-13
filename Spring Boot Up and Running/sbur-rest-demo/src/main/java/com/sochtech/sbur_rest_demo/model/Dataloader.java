package com.sochtech.sbur_rest_demo.model;

import com.sochtech.sbur_rest_demo.entity.Coffee;
import com.sochtech.sbur_rest_demo.repository.CoffeeRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Dataloader
{
    private final CoffeeRepository coffeeRepository;

    public Dataloader(CoffeeRepository coffeeRepository)
    {
        this.coffeeRepository = coffeeRepository;
    }

    private void loadData()
    {
        coffeeRepository.saveAll(List.of(
                        new Coffee("Cafe Cereza"),
                        new Coffee("Cafe Ganador"),
                        new Coffee("Cafe lareno"),
                        new Coffee("Cafe Tres Pontas")
        ));
    }
}

package com.sochtech.sbur_rest_demo.controller;

import com.sochtech.sbur_rest_demo.entity.Coffee;
import com.sochtech.sbur_rest_demo.repository.CoffeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/coffees")
public class RestApiDemoController
{
    private final CoffeeRepository coffeeRepository;

    public RestApiDemoController(CoffeeRepository coffeeRepository)
    {
        this.coffeeRepository = coffeeRepository;

        this.coffeeRepository.saveAll(List.of(
                new Coffee("Cafe Cereza"),
                new Coffee("Cafe Ganador"),
                new Coffee("Cafe lareno"),
                new Coffee("Cafe Tres Pontas")
                ));
    }

//     private final List<Coffee> coffees = new ArrayList<>();
//    public RestApiDemoController()
//    {
//        coffees.addAll(List.of(new Coffee("Cafe Cereza"),
//                               new Coffee("Cafe Ganador"),
//                               new Coffee("Cafe lareno"),
//                               new Coffee("Cafe Tres Pontas")
//        ));
//    }

    // @RequestMapping(value = "/coffees", method = RequestMethod.GET)
    @GetMapping
    Iterable<Coffee> getCoffees()
    {
        return coffeeRepository.findAll();
    }

    @GetMapping("/{id}")
    Optional<Coffee> getCoffeeById(@PathVariable String id)
    {
//        for (Coffee c : coffees)
//        {
//            if (c.getId().equals(id))
//            {
//                return Optional.of(c);
//            }
//        }
//        return Optional.empty();

        return coffeeRepository.findById(id);
    }

    @PostMapping
    Coffee postCoffee(@RequestBody Coffee coffee)
    {
//        coffees.add(coffee);
//        return coffee;

        return coffeeRepository.save(coffee);
    }

    @PutMapping("/{id}")
    ResponseEntity<Coffee> putCoffee(@PathVariable String id, @RequestBody Coffee coffee)
    {
//        int coffeeIndex = -1;
//        for (Coffee c : coffees)
//        {
//            if (c.getId().equals(id))
//            {
//                coffeeIndex = coffees.indexOf(c);
//                coffees.set(coffeeIndex, coffee);
//            }
//        }
//        return (coffeeIndex == -1) ? new ResponseEntity<>(postCoffee(coffee), HttpStatus.CREATED).getBody() : new ResponseEntity<>(coffee, HttpStatus.OK).getBody();

        return (coffeeRepository.existsById(id)) ?
                new ResponseEntity<>(coffeeRepository.save(coffee), HttpStatus.OK):
                new ResponseEntity<>(coffeeRepository.save(coffee), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    void  deleteCoffee(@PathVariable String id)
    {
//        coffees.removeIf(c -> c.getId().equals(id));
        coffeeRepository.deleteById(id);
    }
}

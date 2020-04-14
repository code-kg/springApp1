package java1902.timur.springApp.controller;

import java1902.timur.springApp.entity.Car;
import java1902.timur.springApp.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;
    @GetMapping
    public List<Car> getAll(){
        return carService.getAll();
    }
    @GetMapping("/{id}")
    public Car getById(@PathVariable Long id){
        return carService.getById(id);
    }

    @PostMapping
    public Car create(@RequestBody Car car){
        return carService.create(car);
    }

    @PutMapping
    public Car update(@RequestBody Car car){
        return carService.update(car);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        carService.deleteById(id);
    }

}

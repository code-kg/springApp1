package java1902.timur.springApp.service;

import java1902.timur.springApp.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> getAll();
    Car getById(Long id);
    Car create(Car city);
    Car update(Car city);
    void deleteById(Long id);
}

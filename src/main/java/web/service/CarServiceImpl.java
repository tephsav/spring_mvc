package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> count(List<Car> cars, int n) {
        return cars.stream().limit(n).collect(Collectors.toList());
    }
}

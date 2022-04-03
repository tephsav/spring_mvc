package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model, @RequestParam(name = "count", required = false, defaultValue = "${maxCar}") int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Car1", "color1", 1992));
        cars.add(new Car("Car2", "color2", 1996));
        cars.add(new Car("Car3", "color3", 2000));
        cars.add(new Car("Car4", "color4", 2005));
        cars.add(new Car("Car5", "color5", 2007));
        cars.add(new Car("Car6", "color6", 2009));
        cars.add(new Car("Car7", "color7", 2012));
        cars.add(new Car("Car8", "color8", 2015));
        cars.add(new Car("Car9", "color9", 2017));
        cars.add(new Car("Car10", "color10", 2019));
        CarService carService = new CarServiceImpl();
        cars = carService.count(cars, count);
        model.addAttribute("cars", cars);

        return "car";
    }
}
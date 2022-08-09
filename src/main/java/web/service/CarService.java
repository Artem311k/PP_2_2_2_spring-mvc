package web.service;


import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Model one", "green", 100));
        carList.add(new Car("Model two", "black", 200));
        carList.add(new Car("Model three", "white", 300));
        carList.add(new Car("Model four", "blue", 400));
        carList.add(new Car("Model five", "yellow", 500));

    }

    public List<Car> showCars(int count) {
        if (count > 0 && count <= 5) {
            return carList.stream().limit(count).collect(Collectors.toList());
        } else if (count <= 0) {
            return Collections.emptyList();
        }
        return carList;


    }
}

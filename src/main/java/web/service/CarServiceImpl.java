package web.service;

import org.springframework.stereotype.Service;
import web.entity.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = Arrays.asList(
            new Car("Yellow", "BMV", 1),
            new Car("Red", "Audi", 2),
            new Car("Blue", "Mersedes", 3),
            new Car("Black", "Lexus", 4),
            new Car("White", "Lada", 5));

    @Override
    public List<Car> getCarsByCount(int count) {
        if(count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}

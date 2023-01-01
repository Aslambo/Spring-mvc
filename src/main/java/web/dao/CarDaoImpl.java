package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarDaoImpl implements CarDao {
    private final List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("BMW", "M5", "V8"));
        cars.add(new Car("Mers", "E63", "V6"));
        cars.add(new Car("Lada", "Vesta", "V4"));
        cars.add(new Car("Porsche", "Panamera", "V12"));
        cars.add(new Car("Lamborghini", "Aventador", "V12"));
    }
    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}

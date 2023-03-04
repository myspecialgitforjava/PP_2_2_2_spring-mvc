package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao {

    List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1, "BMW",345, 320000.0));
        cars.add(new Car(2,"MB",560, 560000.0));
        cars.add(new Car(3,"Seat",124, 9000.0));
        cars.add(new Car(4,"Kia",134, 20000.0));
        cars.add(new Car(5,"Daewoo",89, 3000.0));
    }

    @Override
    public List<Car> getCarsList(Integer counter) {

        return cars.stream().limit(counter).collect(Collectors.toList());
    }
}

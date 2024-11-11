package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDAOImpl implements CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW1","Red1",1));
        cars.add(new Car("BMW2","Red2",2));
        cars.add(new Car("BMW3","Red3",3));
        cars.add(new Car("BMW4","Red4",4));
        cars.add(new Car("BMW5","Red5",5));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}

package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW1","Red1",1));
        cars.add(new Car("BMW2","Red2",2));
        cars.add(new Car("BMW3","Red3",3));
        cars.add(new Car("BMW4","Red4",4));
        cars.add(new Car("BMW5","Red5",5));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            return new ArrayList<>(cars);
        }
        return cars.subList(0, Math.min(count, cars.size()));
    }
}

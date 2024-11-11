package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private CarDAO carDAO;

    @Autowired
    public CarServiceImpl (CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> allCars = carDAO.getAllCars();
        if (count >= 5) {
            return allCars;
        }
        return allCars.subList(0, Math.min(count, allCars.size()));
    }
}

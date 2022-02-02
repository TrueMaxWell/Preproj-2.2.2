package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public List<Car> getCarList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "X5", 2005));
        carList.add(new Car("OPEL", "ASTRA", 1999));
        carList.add(new Car("TOYOTA", "SUPRA", 1991));
        carList.add(new Car("AUDI", "A6", 2016));
        carList.add(new Car("TESLA", "MODEL X", 2020));
        carList.add(new Car("LADA", "GRANTA", 2012));
        carList.add(new Car("MITSUBISHI", "LANCER X", 2007));
        carList.add(new Car("LEXUS", "IS200", 2002));
        carList.add(new Car("HONDA", "ACCORD", 2006));
        carList.add(new Car("LADA", "VESTA", 2015));
        return carList;
    }
}

package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    List<Car> carList = Arrays.asList(
            new Car("BMW", "X5", 2005),
            new Car("OPEL", "ASTRA", 1999),
            new Car("TOYOTA", "SUPRA", 1991),
            new Car("AUDI", "A6", 2016),
            new Car("TESLA", "MODEL X", 2020),
            new Car("LADA", "GRANTA", 2012),
            new Car("MITSUBISHI", "LANCER X", 2007),
            new Car("LEXUS", "IS200", 2002),
            new Car("HONDA", "ACCORD", 2006),
            new Car("LADA", "VESTA", 2015));

    public List<Car> getCarList(Integer carCount) {
        try {
            if(carCount < 5){
                return carList.subList(0, carCount);
            } else {
                return carList;
            }
        } catch (NullPointerException e) {
            return carList;
        }
    }
}

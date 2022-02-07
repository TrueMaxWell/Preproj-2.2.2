package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(name = "count", required = false) Integer carCount, ModelMap model) {
        List<String> messages = new ArrayList<>();
        carService.getCarList(carCount).forEach(car -> messages.add(car.toString()));
        model.addAttribute("messages", messages);
        return "cars";
    }
}

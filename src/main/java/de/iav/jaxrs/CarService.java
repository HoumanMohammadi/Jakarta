package de.iav.jaxrs;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class CarService {

    private CarRepo carRepo;

    public CarService() {
    }

    @Inject

    public CarService(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public List<Car> getAllCars(){
        return carRepo.getListOfCar();
    }

    public void addCar(Car car){
         carRepo.add(car);
    }
}

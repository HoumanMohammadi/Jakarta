package de.iav.jaxrs;

import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/car")
public class CarController {


    private final CarService carService;
    @Inject
    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> getAllCars() {
        //return this.listOfCars;
        return carService.getAllCars();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Car addCar(@Valid Car car){
        carService.addCar(car);
        return car;
    }

}
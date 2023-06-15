package de.iav.jaxrs;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CarRepo {

    private final List<Car> listOfCar;

    public CarRepo() {
        this.listOfCar = new ArrayList<>();
    }

    public List<Car> getListOfCar(){return listOfCar;}
    public void add(Car c){this.listOfCar.add(c);}

    public int size(){return this.listOfCar.size();}

    @Override
    public String toString() {
        return "CarRepo{" +
               "listOfCar=" + listOfCar +
               '}';
    }
}

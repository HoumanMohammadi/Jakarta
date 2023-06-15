package de.iav.jaxrs;

public class CarNotFoundException extends RuntimeException{

    public CarNotFoundException(String brand) {
        super("Car with brand "+brand+" not found");
    }
}

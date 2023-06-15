package de.iav.jaxrs;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class CarApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();

        classes.add(CarController.class);
        classes.add(CarNotFoundExceptionMapper.class);
        classes.add(ConstraintViolationExceptionMapper.class);

        return classes;
    }


}

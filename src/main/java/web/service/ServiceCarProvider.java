package web.service;

import web.model.Car;

import java.util.List;

public interface ServiceCarProvider {

    List<Car> getNCars(Integer n);
}

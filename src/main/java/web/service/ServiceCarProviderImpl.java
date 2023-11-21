package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceCarProviderImpl implements ServiceCarProvider {
    private final List<Car> cars = new ArrayList<>();

    public ServiceCarProviderImpl() {
        cars.add(new Car("Chrysler 300C I, Sedan SRT8", 123456, "Walter White"));
        cars.add(new Car("2006 Jeep Commander", 654321, "Hank Schrader"));
        cars.add(new Car("1997 Cadillac DeVille", 777777, "Saul Goodman"));
        cars.add(new Car("1970 Pontiac Lemans", 666, "Tuco Salamanca"));
        cars.add(new Car("Lada Sedan", 1111, "Baklajan"));
    }

    @Override
    public List<Car> getNCars(Integer n) {
        if (n == null) {
            return cars;
        }
        return cars.stream()
                .limit(n)
                .toList();
    }
}

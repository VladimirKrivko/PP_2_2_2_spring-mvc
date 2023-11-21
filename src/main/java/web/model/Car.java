package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private int series;
    private String owner;

    public Car() {
    }

    public Car(String model, int series, String owner) {
        this.model = model;
        this.series = series;
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return getSeries() == car.getSeries() && Objects.equals(getModel(), car.getModel()) && Objects.equals(getOwner(), car.getOwner());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getSeries(), getOwner());
    }

    @Override
    public String toString() {
        return "Car{" +
               "model='" + model + '\'' +
               ", series=" + series +
               ", owner='" + owner + '\'' +
               '}';
    }
}

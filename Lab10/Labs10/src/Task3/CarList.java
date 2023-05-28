package Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarList {
    private List<Car> carList;

    public CarList() {
        this.carList = new ArrayList<>();
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public Car getCarByModel(String model) {
        for (Car car : carList) {
            if (car.getModel().equals(model)) {
                return car;
            }
        }
        return null;
    }

    public void removeCarByModel(String model) {
        for (Car car : carList) {
            if (car.getModel().equals(model)) {
                carList.remove(car);
            }
        }
    }

    public void sortByPrice() {
        Collections.sort(carList, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
    }

    public void printCarList() {
        for (Car car : carList) {
            System.out.println(car);
        }
    }
}

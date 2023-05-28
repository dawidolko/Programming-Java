package Task3;

public class Main {
    public static void main(String[] args) {
        CarList carList = new CarList();
        carList.addCar(new Car("Ford", "Mustang", 200, 35000));
        carList.addCar(new Car("BMW", "X5", 250, 40000));
        carList.addCar(new Car("Audi", "A4", 190, 30000));
        carList.addCar(new Car("Fiat", "500", 130, 20000));
        carList.addCar(new Car("Volvo", "V90", 180, 25000));

        System.out.println("Lista samochodów:");
        carList.printCarList();
        System.out.println();

        System.out.println("Usuwam samochód o modelu Fiat 500:");
        carList.removeCarByModel("500");
        carList.printCarList();
        System.out.println();

        System.out.println("Sortuję samochody po cenie:");
        carList.sortByPrice();
        carList.printCarList();
        System.out.println();

        System.out.println("Sprawdzam czy lista zawiera samochód o modelu Audi A4: ");
        Car car = carList.getCarByModel("A4");
        System.out.println(car);
    }
}
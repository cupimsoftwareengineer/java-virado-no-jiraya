package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
  private static List<Car> cars = List.of(new Car("green", 2023), new Car("black", 2005), new Car("red", 2011));

  public static void main(String[] args) {
//    List<Car> greenCars = filter(cars, new CarPredicate() {
//      @Override
//      public boolean test(Car car) {
//        return car.getColor().equals("green");
//      }
//    });

    List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
    List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
    List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2015);
    System.out.println(greenCars);
    System.out.println(redCars);
    System.out.println(yearBeforeCars);
  }

  private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
    List<Car> filteredCar = new ArrayList<>();
    for (Car car : cars) {
      if (carPredicate.test(car)) {
        filteredCar.add(car);
      }
    }
    return filteredCar;
  }
}
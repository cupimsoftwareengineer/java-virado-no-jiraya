package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
  private static List<Car> cars = List.of(new Car("green", 2023), new Car("black", 2005), new Car("red", 2011));

  public static void main(String[] args) {
    System.out.println(filterGreenCar(cars));
    System.out.println(filterCarByColor(cars, "red"));
    System.out.println();
    System.out.println(filterByYearBefore(cars, 2015));
  }

  private static List<Car> filterGreenCar(List<Car> cars) {
    List<Car> filteredCar = new ArrayList<>();
    for (Car car : cars) {
      if (car.getColor().equals("green")) {
        filteredCar.add(car);
      }
    }
    return filteredCar;
  }

  private static List<Car> filterCarByColor(List<Car> cars, String color) {
    List<Car> filteredCar = new ArrayList<>();
    for (Car car : cars) {
      if (car.getColor().equals(color)) {
        filteredCar.add(car);
      }
    }
    return filteredCar;
  }

  private static List<Car> filterByYearBefore(List<Car> cars, int year) {
    List<Car> filteredCar = new ArrayList<>();
    for (Car car : cars) {
      if (car.getYear() < year) {
        filteredCar.add(car);
      }
    }
    return filteredCar;
  }
}
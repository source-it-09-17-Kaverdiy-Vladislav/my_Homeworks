package HomeWork4.demo;

import HomeWork4.Cars.BMW;
import HomeWork4.Cars.Car;
import HomeWork4.Cars.Porsche;
import HomeWork4.utils.Checker;

import java.util.ArrayList;
import java.util.List;


public class Demo extends Car {


    public static void main(String[] args) {

        System.out.println("Testing class type: " + Checker.getRealType(new Car()));

        List<Car> cars = new ArrayList<>();
        cars.add(new BMW("Red", 120, 1000).setModel("X5"));
        cars.add(new Porsche("Blue", 140, 800, 3).setModel("Cayenne"));
        for (Car car: cars) {
            System.out.println(car);
        }


        Car bmw = new BMW("Blue");
        ((BMW)bmw).setWeight(1500);
        System.out.println(bmw);

        Car porsche = new Porsche("Green", 240, 700, 3500, "911 GT2 RS");
        ((Porsche)porsche).setSpeed(220);
        System.out.println(porsche);



    }
}

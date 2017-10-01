package HomeWork4;

import HomeWork4.Cars.BMW;
import HomeWork4.Cars.Car;
import HomeWork4.Cars.Porsche;

public class Demo extends Car {
    public static void main(String[] args) {

     Car car = new Car();
     Car car1 = new BMW("black");
     Car car2 = new Porsche("red", 120, 1500);

        System.out.println(car1);

    }
}

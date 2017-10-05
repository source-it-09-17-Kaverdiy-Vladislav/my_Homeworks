package HomeWork4.demo;

import HomeWork4.Cars.BMW;
import HomeWork4.Cars.Car;
import HomeWork4.Cars.Porsche;
import HomeWork4.carService.CarFactory;
import HomeWork4.myAbstractFactory.AbstractFactory;
import HomeWork4.myAbstractFactory.CarColor;
import HomeWork4.myAbstractFactory.FactoryProducer;
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


        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.getCar("CAR");

       car1.draw();
       car1.repair();
        System.out.println(car1 instanceof Car);

        Car car2 = carFactory.getCar("BMW");

        car2.draw();
        car2.repair();
        System.out.println(car2 instanceof BMW);

        Car car3 = carFactory.getCar("PORSCHE");

        car3.draw();
        car3.repair();
        System.out.println(car3 instanceof Porsche);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        AbstractFactory carFactory2 = FactoryProducer.getFactory("CAR");
        Car car4 = carFactory2.getCar("CAR");
        car4.draw();
        car4.repair();
        System.out.println(car4 instanceof Car);



        Car car5 = carFactory2.getCar("BMW");
        car5.draw();
        car5.repair();
        System.out.println(car5 instanceof Car);


        Car car6 = carFactory2.getCar("PORSCHE");
        car6.draw();
        car6.repair();
        System.out.println(car6 instanceof Car);




        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");


        CarColor color1 = colorFactory.getColor("RED");
        color1.paint();
        System.out.println(color1 instanceof CarColor);

        CarColor color2 = colorFactory.getColor("BLUE");
        color2.paint();
        System.out.println(color2 instanceof CarColor);

        CarColor color3 = colorFactory.getColor("GREEN");
        color3.paint();
        System.out.println(color3 instanceof CarColor);

        CarColor color4 = colorFactory.getColor("BLACK");
        color4.paint();
        System.out.println(color4 instanceof CarColor);



    }
}



package HomeWork4.myAbstractFactory;

import HomeWork4.Cars.Car;

public abstract class AbstractFactory  {

    public abstract CarColor getColor(String color);
    public abstract Car getCar(String carType);
}

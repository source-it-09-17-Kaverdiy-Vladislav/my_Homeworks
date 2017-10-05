package HomeWork4.carService;

import HomeWork4.Cars.BMW;
import HomeWork4.Cars.Car;
import HomeWork4.Cars.Porsche;
import HomeWork4.myAbstractFactory.AbstractFactory;
import HomeWork4.myAbstractFactory.CarColor;


public  class CarFactory extends AbstractFactory {

    @Override
    public CarColor getColor(String color) {
        return null;
    }

    public Car getCar(String carType){

    if(carType == null){
        return null;
    }
    if(carType.equalsIgnoreCase("BMW")){
        return new BMW();

    } else if(carType.equalsIgnoreCase("PORSCHE")){
        return new Porsche();

    } else if(carType.equalsIgnoreCase("CAR")){
        return new Car();
    }

    return null;



}
}


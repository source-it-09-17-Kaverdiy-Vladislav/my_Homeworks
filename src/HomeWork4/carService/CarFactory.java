package HomeWork4.carService;

import HomeWork4.Cars.BMW;
import HomeWork4.Cars.Car;
import HomeWork4.Cars.Porsche;

public class CarFactory  {

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


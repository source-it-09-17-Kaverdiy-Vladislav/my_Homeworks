package HomeWork4.carService;

import HomeWork4.Cars.BMW;
import HomeWork4.Cars.Car;
import HomeWork4.Cars.Porsche;

public class CarFactory  {

    public Car getCar(Car car) {
        if (car.RepairEngine()) equals(CarType.BMW); {
            return new BMW();

       } else if(car.ReplacementWheels()) equals(CarType.BMW);{
            return new BMW();

        }else if(car.RepairEngine()) equals(CarType.PORSCHE);
        {
           return new Porsche();
       }else if (car.ReplacementWheels()) equals(CarType.PORSCHE);
        {
            return new Porsche();

        }}}

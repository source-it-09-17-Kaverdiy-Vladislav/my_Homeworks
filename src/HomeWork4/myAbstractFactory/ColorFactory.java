package HomeWork4.myAbstractFactory;

import HomeWork4.Cars.Car;

public class ColorFactory extends AbstractFactory {
    @Override
    public Car getCar(String carType) {
        return null;
    }


    @Override
    public CarColor getColor(String color) {

        if(color.equalsIgnoreCase("RED")){
        return new Red();

    }else if(color.equalsIgnoreCase("GREEN")){
        return new Green();

    }else if(color.equalsIgnoreCase("BLUE")){
        return new Blue();
    }else if(color.equalsIgnoreCase("BLACK")){
        return new Black();
        }

      return null;
}


}

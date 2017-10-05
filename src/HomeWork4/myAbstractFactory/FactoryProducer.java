package HomeWork4.myAbstractFactory;

import HomeWork4.carService.CarFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("CAR")){
            return new CarFactory() {
            };

        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }
}



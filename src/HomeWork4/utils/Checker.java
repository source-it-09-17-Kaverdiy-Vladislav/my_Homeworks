package HomeWork4.utils;

import HomeWork4.Cars.BMW;
import HomeWork4.Cars.Car;
import HomeWork4.Cars.Porsche;

public final class Checker {


    public static String getRealType(Car car) {
        if (car instanceof BMW) {
            return "BMW";
        }
        if (car instanceof Porsche) {
            return "Porsche";
        }
        return "unknown Object type!";
    }
}


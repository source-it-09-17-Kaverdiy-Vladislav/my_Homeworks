package HomeWork4.Cars;

import HomeWork4.carService.CarService;

import java.math.BigInteger;

public class Car implements CarService{
    protected String color;
    protected BigInteger speed;
    protected String manufacturer;
    protected Double VolumeOfMotor;
    protected String model;


    public void setColor(String color) {
        this.color = color;
    }

    public void getColor(String s){

    }


    @Override
    public void repair() {
        System.out.println("Car repairing");

    }

    @Override
    public void draw() {
        System.out.println("Car  drawing");

    }
}

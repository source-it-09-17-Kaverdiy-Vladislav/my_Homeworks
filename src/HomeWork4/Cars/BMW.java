package HomeWork4.Cars;

import HomeWork4.carService.CarService;

public class BMW extends Car implements CarService {


private static int NumberOfCars;
private static int NumberOfSportCars;

static{
    NumberOfCars = 0;
    NumberOfSportCars = 0;
}


    private String color;
    private int speed;
    private int weight;
    private int VolumeOfMotor;
    private String model;





    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        color = "Blue";
    }

    public int getSpeed() {
        if(speed != 0){

    }return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public BMW setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public int getVolumeOfMotor() {
        return VolumeOfMotor;
    }

    public void setVolumeOfMotor(int volumeOfMotor) {
        VolumeOfMotor = volumeOfMotor;
    }

    public String getModel() {
        return model;
    }

    public BMW setModel(String model) {
        this.model = model;
        return this;
    }

    public BMW setSpeed() {
        if (isCountValid(speed)) {
            speed = speed;
        }
        return this;
    }

    private boolean isCountValid(int speed) {
        return speed >= 0;
    }

    public BMW setManufacturer() {
        this.manufacturer = "Unknown";
        return this;
    }
    public BMW setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }
    public BMW setModel() {
        this.model = "Unknown";
        return this;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////

    public BMW(String color, int speed, int weight) {
        this.color = color;
        this.speed = speed;
        this.weight = weight;
    }

    public BMW(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public BMW(String color) {
        this.color = color;
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public void getColor(String s) {

        super.getColor("black");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BMW bmw = (BMW) o;

        if (speed != bmw.speed) return false;
        if (weight != bmw.weight) return false;
        if (VolumeOfMotor != bmw.VolumeOfMotor) return false;
        if (!color.equals(bmw.color)) return false;
        return model.equals(bmw.model);
    }

    @Override
    public int hashCode() {
        int result = color.hashCode();
        result = 31 * result + speed;
        result = 31 * result + weight;
        result = 31 * result + VolumeOfMotor;
        result = 31 * result + model.hashCode();
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "BMW{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                ", VolumeOfMotor=" + VolumeOfMotor +
                ", model='" + model + '\'' +
                '}';
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public void RepairEngine() {

    }

    @Override
    public void ReplacementWheels() {

    }
}


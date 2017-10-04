package HomeWork4.Cars;

import HomeWork4.carService.CarService;

public class Porsche extends Car implements CarService {

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
    }

    public int getSpeed() {
        if(speed != 0){

    }return speed;
}

    public Porsche setSpeed(int speed) {

        this.speed = speed;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    public Porsche setModel(String model) {
        this.model = model;
        return this;
    }
    public Porsche setModel() {
        this.model = "Unknown";
        return this;
    }

    public Porsche setSpeed() {
        if (isCountValid(speed)) {
            speed = speed;
        }
        return this;
    }

    private boolean isCountValid(int speed) {
        return speed >= 0;
    }
    public Porsche setManufacturer() {
        this.manufacturer = "Unknown";
        return this;
    }


    public Porsche setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Porsche(){

}

    public Porsche(String color, int speed, int weight, int volumeOfMotor, String model) {
        this.color = color;
        this.speed = speed;
        this.weight = weight;
        VolumeOfMotor = volumeOfMotor;
        this.model = model;
    }

    public Porsche(String color, int speed, int weight, int volumeOfMotor) {
        this.color = color;
        this.speed = speed;
        this.weight = weight;
        VolumeOfMotor = volumeOfMotor;
    }

    public Porsche(String color, int speed, int weight) {
        this.color = color;
        this.speed = speed;
        this.weight = weight;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void getColor(String s) {

        super.getColor("red");
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Porsche{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                ", VolumeOfMotor=" + VolumeOfMotor +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Porsche porsche = (Porsche) o;

        if (speed != porsche.speed) return false;
        if (weight != porsche.weight) return false;
        if (VolumeOfMotor != porsche.VolumeOfMotor) return false;
        if (!color.equals(porsche.color)) return false;
        return model.equals(porsche.model);
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
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public boolean RepairEngine() {

        return false;
    }

    @Override
    public boolean ReplacementWheels() {

        return false;
    }
}

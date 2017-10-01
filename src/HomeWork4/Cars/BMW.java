package HomeWork4.Cars;

public class BMW extends Car {
    private String color;
    private int speed;
    private int weight;
    private int VolumeOfMotor;
    private String model;



    @Override
    public void getColor(String s) {
        super.getColor("black");
    }
    @Override
    public void getModel(String s) {
        super.getColor("X5");
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

    public void setSpeed(int speed) {
        this.speed = speed;
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

    public void setModel(String model) {
        this.model = model;
    }

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
}

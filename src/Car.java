public class Car extends Vehicle {
    private int milesPerGallon;

    public Car(boolean isOperable, int passengerCapacity, String powersource, int milesPerGallon) {
        super(isOperable, passengerCapacity, powersource);
        this.milesPerGallon = milesPerGallon;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }
    public void deployAirBag(){
        System.out.println("Deploying airbag...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "milesPerGallon=" + milesPerGallon +
                '}';
    }
    public void turnOn(){
        System.out.println("Cranking engine...");
    }
}

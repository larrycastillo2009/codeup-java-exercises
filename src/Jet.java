public class Jet extends Vehicle {
    private int maximumAltitude;

    public void takeOff(){
        System.out.println("Taking off...");
    }

    public Jet(boolean isOperable, int passengerCapacity, String powersource, int maximumAltitude) {
        super(isOperable, passengerCapacity, powersource);
        this.maximumAltitude = maximumAltitude;
    }

    public int getMaximumAltitude() {
        return maximumAltitude;
    }

    public void setMaximumAltitude(int maximumAltitude) {
        this.maximumAltitude = maximumAltitude;
    }

    @Override
    public String toString() {
        return "Jet{" +
                "maximumAltitude=" + maximumAltitude +
                '}';
    }

    public void turnOn(){
        System.out.println("Igniting jet engines...");
    }

    public void genericTurnOn(){
        super.turnOn();
    }
}

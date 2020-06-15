public class Vehicle {
    private boolean isOperable;
    private int passengerCapacity;
    private String powersource;

    public String getPowersource() {
        return powersource;
    }

    public void setPowersource(String powersource) {
        this.powersource = powersource;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public boolean isOperable() {
        return isOperable;
    }

    public void setOperable(boolean operable) {
        isOperable = operable;
    }

//    @Override
//    public String toString() {
//        return "Vehicle{" +
//                "isOperable=" + isOperable +
//                ", passengerCapacity=" + passengerCapacity +
//                ", powersource='" + powersource + '\'' +
//                '}';
//    }

    public String toString() {
        return "This vehicle is isOperable: " + isOperable +" it seats: " + passengerCapacity + " it is powered by: " + powersource;
    }

    public Vehicle() {
    }

    public Vehicle(boolean isOperable, int passengerCapacity, String powersource) {
        this.isOperable = isOperable;
        this.passengerCapacity = passengerCapacity;
        this.powersource = powersource;
    }

    public void turnOn(){
        System.out.println("Vehicle is turning on...");
    }

    public void onAll(Vehicle[] arr){

    }
}

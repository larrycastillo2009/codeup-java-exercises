public class VehicleTest {
    public static void main(String[] args) {
        Vehicle Vehicle = new Vehicle(true,4,"battery");
        Vehicle Jet = new Vehicle(false,2,"fuel");
        Vehicle Car = new Vehicle(true, 4, "Electric");
        Car Toyota = new Car(true,4,"fuel",35);
        Jet cessna = new Jet(true,2,"fuel",1000);
        final int passengerConst = 4;

        System.out.println(Vehicle.toString());
        System.out.println("");

        System.out.println(Jet.toString());
        System.out.println("");

        System.out.println(Car.toString());
        System.out.println("");

        System.out.println(Toyota.toString());
        Toyota.deployAirBag();
        System.out.println("");

        System.out.println(cessna);
        cessna.takeOff();
        System.out.println("");

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(true,4,"electric",5);
        vehicles[1] = new Jet(true,4,"electric",60);
        vehicles[2] = new Vehicle(true,4, "electric");

        Vehicle.onAll(vehicles);




    }
}

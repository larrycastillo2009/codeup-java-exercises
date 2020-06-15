public class VehicleTest {
    public static void main(String[] args) {
        Vehicle Vehicle = new Vehicle(true,4,"battery");
        Vehicle Jet = new Vehicle(false,2,"fuel");
        Vehicle Car = new Vehicle(true, 4, "Electric");
        Car Toyota = new Car(true,4,"fuel",35);
        Jet cessna = new Jet(true,2,"fuel",1000);

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






    }
}

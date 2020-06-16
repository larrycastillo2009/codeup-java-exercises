public class AppliancesTest {
    public static void main(String[] args) {
        Appliance Blender = new Blender("larry", "red");
        Appliance Refrig = new Refrigerator("Vhris", "red");
        Blender.doWork();
        Blender.makeSound();
        Refrig.doWork();
        Refrig.makeSound();
    }


}

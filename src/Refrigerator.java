public class Refrigerator extends Appliance {

    public Refrigerator(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void doWork() {
        System.out.println("Storing food in cool temperature");
    }

    @Override
    public void makeSound() {
        System.out.println("burrrrrrr");
    }
}

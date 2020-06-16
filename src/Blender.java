public class Blender extends Appliance{
    @Override
    public void doWork() {
        System.out.println("dicing and mixing food");
    }

    @Override
    public void makeSound() {
        System.out.println("whuuuurrrrrrr");
    }

    public Blender(String brand, String color) {
        super(brand, color);
    }
}

package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        code from the first shape exercise
        Rectangle box1 = new Rectangle(5,4);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());

//        Rectangle box2 =new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

//        Measurable myShape = new Square(5);
//        System.out.println(myShape.getArea());
//        System.out.println(myShape.getPerimeter());

        Measurable myShape = new Rectangle(5,10);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

//        #9 Rectangle is not abstract and does not override abstract method getPerimeter in shapes.measurable

//            #10 getLength and getWidth do not exist in the interface of Measurable

    }
}

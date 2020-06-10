package shapes;
import util.input;

public class CircleApp {
    public static void main(String[] arg){
        input in = new input();
        System.out.println("Welcome to the circle app! Please enter a radius so that we can help you find the area and circumference:");
        double radius = in.getdouble();
        Circle cir = new Circle(radius);

        System.out.println(cir.getArea());
        System.out.println(cir.getCircumference());
    }

}

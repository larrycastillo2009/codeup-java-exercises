package shapes;

public class Circle {
    private static double radius;

    public Circle(double radius){
        Circle.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;

    }
    public double getCircumference(){
        return Math.PI * radius * 2;

    }

}

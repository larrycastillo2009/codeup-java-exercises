package shapes;

public class Square extends Quadrilateral {
//    public int side;
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public int getArea() {
//        System.out.println("override");
//        return side * side  ;
//    }
//
//    public int getPerimeter(){
//        System.out.println("override");
//        return 4 * side;
//    }

    public Square(double side) {
        super(side, side);
    }

    @Override
    void setLength(double side) {
        length =side;
    }

    @Override
    void setWidth(double side) {
        width = side;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

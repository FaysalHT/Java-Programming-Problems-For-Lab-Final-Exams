package abstracttest;

abstract class Shape{
    public abstract double calcArea();
}

class Circle extends Shape{
    double radius;
    Circle(double rad){
        radius = rad;
    }
    @Override
    public double calcArea() {
        return (3.1416*radius*radius);
    }  
}

class Square extends Shape{
    double height;
    double length;
    Square(double h, double l){
        height = h;
        length = l;
    }
    @Override
    public double calcArea() {
        return (height * length);
    }  
}

public class AbstractTest {

    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        Square s = new Square(4,6);
        System.out.println("AREA OF CIRCLE = " +c.calcArea());
        System.out.println("AREA OF SQUARE = " +s.calcArea());
    }
}

package interfacetask;

interface Shape{
    double getArea();
    double getPerimeter();
}

class Circle implements Shape{
    double radius;
    void Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}

class Rectangle implements Shape{
    double length;
    double height;
    void Circle(double length, double height){
        this.length = length;
        this.height = height;
    }

    @Override
    public double getArea() {
        return length*height;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+height);
    }
}
public class InterfaceTask {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle with radius 5:");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println();
        
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle with length 4 and width 6:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    
    }
    
}

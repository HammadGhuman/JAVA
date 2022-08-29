package Task1;



public class Main {
    public static void main(String args[]){
        Rectangle rectangle = new Rectangle(10,12);
        System.out.println("rectangle area = " + rectangle.calculateArea());
        Circle circle = new Circle(5);
        System.out.println("Circle area = " + circle.calculateArea());
        Triangle triangle = new Triangle(3,3);
        System.out.println("Triangle area = " + triangle.calculateArea());
        Square square = new Square(5);
        System.out.println("Square area = " + square.calculateArea());
    }
}

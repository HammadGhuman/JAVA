package Task1;

public class Circle extends  Shape{
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea(){
        return 3.14*(radius*radius);
    }
}

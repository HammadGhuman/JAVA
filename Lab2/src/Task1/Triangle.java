package Task1;

public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double calculateArea(){
        return  (height*base)/2;
    }

}

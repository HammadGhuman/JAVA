package Task1;

public class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double calculateArea(){
        return side*side;
    }
}

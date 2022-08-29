package Task4;

public class Gunman extends Person {
    public Gunman(String name) {
        super(name, "gunman");
    }

    @Override
    public void draw() {
        System.out.println("A gunman draws a gun to shoot");
    }
}

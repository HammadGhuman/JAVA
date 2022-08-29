package Task4;

public class Artist extends Person {
    public Artist(String name) {
        super(name, "artist");
    }

    @Override
    public void draw() {
        System.out.println("An Artist draw with his paint brush");
    }
}

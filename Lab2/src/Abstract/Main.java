package Abstract;

public class Main {
    public static void main(String[] args){
        Animal myBird = new Bird();
        myBird.label();
        myBird.move();
        myBird.eat();
        Animal myFish = new Fish();
        myFish.label();
        myFish.move();
        myFish.eat();
    }
}

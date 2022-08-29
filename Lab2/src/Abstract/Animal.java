package Abstract;

abstract class Animal {
    // abstract methods
    abstract void move();
    abstract void eat();
    // concrete method
    void label() {
        System.out.println("Animal");
    }
}
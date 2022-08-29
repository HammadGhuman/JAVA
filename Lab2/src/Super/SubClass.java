package Super;

class Subclass extends Parent
{
    Subclass(){
        super("Hahaha");
        System.out.println("Constructor of child class");
    }
    void display(){
        System.out.println("Hello");
    }
    public static void main(String args[]){
        Subclass obj= new Subclass();
        obj.display();
    }
}


package Interface2;


public class Main implements Showable,Printable{
    @Override
    public void print() {
        Printable.super.print();
    }
    public static  void  main (String args[]){
        Main obj = new Main();
        obj.print();
    }




}

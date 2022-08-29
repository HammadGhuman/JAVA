package Task2;

public class Main {
    public static void main(String args[]){
        BankA a = new BankA(1000);
        BankB b = new BankB(1500);
        BankC c = new BankC(2000);
        System.out.println(a.getBalane());
        System.out.println(b.getBalane());
        System.out.println(c.getBalane());

    }
}

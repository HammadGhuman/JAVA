package Task3;

public class Main {
    public static void main(String[] args){
        Imtiaz imtiaz = new Imtiaz(1000);
        BinHasim binHasim = new BinHasim(1000);

        System.out.println("Imtiaz after discout " + imtiaz.calculateTotalBill());
        System.out.println("Bin Hashim after discout " +binHasim.calculateTotalBill());
    }
}

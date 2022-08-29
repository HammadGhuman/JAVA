package Task3;

public class BinHasim extends Store{
    private double discout;
    private double bill;
    public BinHasim(double bill) {
        this.discout = 0.07;
        this.bill = bill;
    }

    @Override
    double calculateTotalBill() {
        double totalbill = bill*discout;
        return bill - totalbill;
    }
}

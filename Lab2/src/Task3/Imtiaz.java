package Task3;

public class Imtiaz extends Store{
    private double discout;
    private double bill;
    public Imtiaz(double bill) {
        this.discout = 0.05;
        this.bill = bill;
    }

    @Override
    double calculateTotalBill() {
        double totalbill = bill*discout;
        return bill - totalbill;
    }
}

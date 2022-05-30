public class Calculator {
    private double tax;

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double calc(double price) {
        return price * (1 + tax);
    }
}
public class Circle {
    private double redius;

    public void setRedius(double redius) {
        this.redius = redius;
    }

    public double getCircumference() {
        return 2 * Math.PI * redius;
    }

    public double getArea() {
        return Math.PI * redius * redius;
    }
}
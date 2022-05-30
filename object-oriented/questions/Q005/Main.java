public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRedius(8);

        System.out.println("半径8の円の円周は" + c1.getCircumference());
        System.out.println("半径8の円の面積は" + c1.getArea());
        
    }
}

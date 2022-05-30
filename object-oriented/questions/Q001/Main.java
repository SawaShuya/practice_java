public class Main {
  public static void main(String[] args) {

    Item ringo = new Item();
    Item banana = new Item();

    ringo.name = "Ringo";
    ringo.price = 10;
    banana.name = "Banana";
    banana.price = 5;

    System.out.println(ringo.name + " costs " + ringo.price);
    System.out.println(banana.name + " costs " + banana.price);

    System.out.println("Hello World!");
  }
}

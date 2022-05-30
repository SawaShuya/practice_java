public class WhileBasicPractice {
  public static void main(String[] args) {
    int x = 1;

    do{
      System.out.println(x);
      x = x * 2;
    } while (x < 1000);
  }
}
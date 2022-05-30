public class IfBasicPractice {
  public static void main(String[] arg){
    int value = 60;
    System.out.println("The value is " + value);

    if (value % 2 == 0) {
      System.out.println("The value is even");
    } else {
      System.out.println("The value is odd");
    }

    if (value % 3 == 0) {
      System.out.println("The value is divisible by 3");
    }
    if (value % 4 == 0) {
      System.out.println("The value is divisible by 4");
    }
    if (value % 5 == 0) {
      System.out.println("The value is divisible by 5");
    }
  }
}
public class MethodBasicPractice {
  public static void main(String[] args) {
    display("test", 5);
  }

  public static void display(String str, int num) {
    for (int i = 0; i < num; i++) {
      System.out.println(str);
    }
  }
}
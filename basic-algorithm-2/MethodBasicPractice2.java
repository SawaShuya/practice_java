public class MethodBasicPractice2 {
  public static void main(String[] args) {
    int a = 18;
    int b = 6;

    System.out.println("add:" + calc(a, b,0));
    System.out.println("sub:" + calc(a, b,1));
    System.out.println("mul:" + calc(a, b,2));
    System.out.println("div:" + calc(a, b,3));

  }

  public static int calc(int a, int b, int type) {
    if (type == 0) {
      return a + b;
    } else if (type == 1) {
      return a - b;
    } else if (type == 2) {
      return a * b;
    } else if (type == 3) {
      return a / b;
    } else {
      return 0;
    }

  }
}
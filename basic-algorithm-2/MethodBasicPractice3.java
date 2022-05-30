public class MethodBasicPractice3 {
  public static void main(String[] args) {
    int x = 88;
    int y = 79;
    int z = 96;

    System.out.println("minmum is" + min(x, y, z));
  }

  public static int min(int a, int b, int c) {
    int min = a;
    if (b < min) {
      min = b;
    }
    if (c < min) {
      min = c;
    }
    return min;
  }
} 
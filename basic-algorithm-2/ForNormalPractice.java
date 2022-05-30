public class ForNormalPractice {
  public static void main(String[] args) {
    for (int i = 10; i < 100; i++) {
      for (int j = 2; j <= i/2; j++) {
        if (i % j == 0) {
          break;
        }
        if (j >= i/2) {
          System.out.println(i);
        }
      }
    }
  }
}
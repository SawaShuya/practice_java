// 市松模様

public class Q009 {
  public static void main(String[] args) {
    int vertical_count = 4;
    int horizontal_count = 4;

    for (int i = 0; i < vertical_count; i++) {
      for (int j = 0; j < horizontal_count; j++) {
        if (i % 2 == j % 2) {
          System.out.print("■");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}

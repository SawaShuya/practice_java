// 縦ストライプ

public class Q008 {
  public static void main(String[] args) {
    int vertical_count = 6;
    int horizontal_count = 7;

    for (int i = 0; i < vertical_count; i++) {
      for (int j = 0; j < horizontal_count; j++) {
        if (j % 2 == 0) {
          System.out.print("■");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}

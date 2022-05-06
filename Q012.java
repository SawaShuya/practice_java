// 右下がりの文字

public class Q012 {
  public static void main(String[] args) {
    int row = 10;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < i + 1; j++) {
        if (j == i) {
          System.out.print("■");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
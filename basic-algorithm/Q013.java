// 左下がり

public class Q013 {
  public static void main(String[] args) {
    int row = 10;
    for (int i = 0; i < row; i++) {
      int col = Math.abs(i - row);
      for (int j = 0; j < col; j++) {
        if (j == col - 1) {
          System.out.print("■");
        } else {
          System.out.print("□");
        }
      }
      System.out.println();
    }
  }
}
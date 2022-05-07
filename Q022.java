// 九九表

public class Q022 {
  public static void main(String[] args) {
    int row = 9;
    int col = 9;
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= col; j++) {
        System.out.print(i * j + " ");
      }
      System.out.println();
    }
  }
}

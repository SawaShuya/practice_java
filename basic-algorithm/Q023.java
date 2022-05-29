// 九九表(綺麗に表示する)

public class Q023 {
  public static void main(String[] args) {
    int row = 9;
    int col = 9;
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= col; j++) {
        if (i * j < 10) {
          System.out.print(" ");
        }
        System.out.print(i * j + " ");
      }
      System.out.println();
    }
  }
}

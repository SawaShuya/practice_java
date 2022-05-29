//  逆三角形
public class Q011 {
  public static void main(String[] args) {
    int row = 10;
    for (int i = row; i > 0 ; i--) {
      int col = i;
      for (int j = 0; j < col; j++) {
        System.out.print("■");
      }
      System.out.println();
    }
  }
}
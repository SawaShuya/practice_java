// 会談に文字を並べる
public class Q010 {
  public static void main(String[] args) { 
    int row = 10;

    for (int i = 0; i < row; i++) {
      int col = i+1;
      for (int j = 0; j < col; j++) {
        System.out.print("■");
      }
      System.out.println();
    }
  }
}
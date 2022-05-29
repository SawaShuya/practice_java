// 3の倍数のときのみ?を表示しながら1から指定の数まで表示

public class Q021 {
  public static void main(String[] args) {
    int max = 25;
    for (int i = 1; i <= max; i++) {
      if (i % 3 == 0) {
        System.out.print("?");
      } else {
        System.out.print(i);
      }
      if (i < max) {
        System.out.print(",");
      } else {
        System.out.println();
      }
    }
  }
}

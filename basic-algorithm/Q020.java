// 1から指定の数までカンマ区切りで表示 (最後カンマなし)

public class Q020 {
  public static void main(String[] args) {
    int max = 10;

    for (int i = 1; i <= max; i++) {
      System.out.print(i);
      if (i < max) {
        System.out.print(",");
      }
    }
  }
}
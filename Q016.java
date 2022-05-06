// 1から指定の数まで任意倍の数を縦に表示

public class Q016 {
  public static void main(String[] args) {
    int count = 5;
    int multiple = 3;
    for (int i = 1; i <= count; i++) {
      System.out.println(i*multiple);
    }
  }
}
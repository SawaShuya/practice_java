// 奇数行にのみ任意の数の■を表示 (横ストライプ)

public class Q007 {

  public static void main(String[] args) {
    int vertical_count = 6;
    int horizontal_count = 7;

    for (int i = 0; i < vertical_count; i++) {
      if (i % 2 == 1) {
        System.out.println();
      } else { 
        for (int j = 0; j < horizontal_count; j++) {
          System.out.print("■");
        }
        System.out.println();
      }
    }
  }
}
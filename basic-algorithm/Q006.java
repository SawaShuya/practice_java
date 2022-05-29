// 任意の数、文字■と□を交互に並べる

public class Q006 {
  public static void main(String[] args) {
    int count = 10;

    for (int i = 0; i < count; i++) {
      if (i % 2 == 0) {
        System.out.print("■");
      } else {
        System.out.print("□");
      }
    }
  }
}
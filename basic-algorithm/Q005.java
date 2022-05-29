// 任意の数、縦と横に■をならべる
public class Q005 {
  public static void main(String[] args) {
    int vertical_count = 4;
    int horizontal_count = 3;

    for (int i = 0; i < vertical_count; i++) {
      for (int j = 0; j < horizontal_count; j++) {
        System.out.print("■");
      }
      System.out.println();
      
    }
  }
}
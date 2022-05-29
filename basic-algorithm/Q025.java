// 配列の内容を逆順に表示

public class Q025 {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int i = array.length - 1; i >= 0 ; i--) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}

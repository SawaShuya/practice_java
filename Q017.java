// 1から指定の数まで、指定の倍数を縦に表示

public class Q017 {
  public static void main(String[] args) {
    int max = 25;
    int multiple = 4;
    int i = 1;
    System.out.println(max + "まで" + multiple + "の倍数を縦に表示");
    do {
      System.out.println(i * multiple);
      i++;
    } while (i * multiple < max);
  }
}
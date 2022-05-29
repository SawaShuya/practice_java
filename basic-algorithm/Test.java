import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("文字を入力してください");
    String string = scanner.next();
    System.out.println("入力された数字は" + string + "です");
  }
}
import java.util.Scanner;

public class Janken {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("グー, チョキ, パーを入力してください");

    int user_hand_num = set_hund_num(scanner.next());
    int com_hand_num = (int)(Math.random() * 3);

    if (!check_number(user_hand_num, com_hand_num)) {
      System.exit(0);
    }
  
    String user_hand = set_hand_name(user_hand_num);
    String com_hand = set_hand_name(com_hand_num);
    String result = set_result(user_hand_num, com_hand_num);

    System.out.println("あなたの手は" + user_hand + "です。私は" + com_hand + "です。" + result + "です。");

  }

  public static int set_hund_num(String str) {
    if (str.equals("グー")) {
      return 0;
    } else if (str.equals("チョキ")) {
      return 1;
    } else if (str.equals("パー")) {
      return 2;
    } else {
      return -1;
    }
  }

  public static String set_hand_name(int num) {
    if (num == 0) {
      return "グー";
    } else if (num == 1) {
      return "チョキ";
    } else if (num == 2) {
      return "パー";
    } else {
      return "";
    }
  }

  public static Boolean check_number(int user_hand_num, int com_hand_num) {
    if (user_hand_num == -1 || com_hand_num == -1) {
      System.out.println("入力された値は無効です。");
      return false;
    } else {
      return true;
    }
  }

  public static String set_result(int user_hand_num, int com_hand_num) {
    if (user_hand_num == com_hand_num) {
      return "あいこ";
    } else if ((user_hand_num == 0 && com_hand_num == 1) || (user_hand_num == 1 && com_hand_num == 2) || (user_hand_num == 2 && com_hand_num == 0)) {
      return "あなたの勝ち";
    } else if ((user_hand_num == 0 && com_hand_num == 2) || (user_hand_num == 1 && com_hand_num == 0) || (user_hand_num == 2 && com_hand_num == 1)) {
      return "あなたの負け";
    } else {
      return "";
    }
  }
}
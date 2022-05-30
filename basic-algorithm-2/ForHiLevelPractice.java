public class ForHiLevelPractice {
  public static void main(String[] args) {
    int level = 5;

    for (int i = 1; i <= level; i++) {
      for (int j = 1; j < level + i; j++) {
        if (j > (level - i) ) {
          System.out.print("■");
        } else {
          System.out.print("□");
        }
      }
      System.out.println();
    }

  }
}
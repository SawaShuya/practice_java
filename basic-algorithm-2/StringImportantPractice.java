public class StringImportantPractice {
  private static final String PASSWORD = "XYZ";
  public static void main(String[] args) {
    System.out.println("enter password");
    String inputPassword = System.console().readLine();

    if (PASSWORD.equals(inputPassword)) {
      System.out.println("correct");
    } else {
      System.out.println("incorrect");
    }
    
  }
}
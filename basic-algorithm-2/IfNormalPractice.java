public class IfNormalPractice {
  public static void main(String[] args){
    int age =-1;
    System.out.println("The age is " + age);

    if (age >= 20) {
      System.out.println("The age is greater than or equal to 20");
    } else if (age >= 0) {
      System.out.println("The age is less than 20");

      if (age >= 6 && age <= 14){
        System.out.println("Compulsory education");
      }else {
        System.out.println("No compulsory education");
      }

    } else {
      System.out.println("error");
    }

  }
}
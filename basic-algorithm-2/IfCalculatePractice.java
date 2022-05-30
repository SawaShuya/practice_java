public class IfCalculatePractice {
  public static void main(String[] args) {
    double height = 170.0;
    double weight = 55.0;

    double bmi = weight / (height * height * 0.0001);

    System.out.println("Your height is " + height + "cm");
    System.out.println("Your weight is " + weight + "kg");
    System.out.println("The BMI is " + bmi);

    if (bmi >= 26.5) {
      System.out.println("You are overweight");
    } else if (bmi >= 24) {
      System.out.println("You are slightly overweight");
    } else if (bmi >= 20) {
      System.out.println("You are normal");
    } else if (bmi >= 0) {
      System.out.println("You are underweight");
    } else {
      System.out.println("Error");
    }

    

  }
}
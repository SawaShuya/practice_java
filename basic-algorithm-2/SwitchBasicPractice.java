public class SwitchBasicPractice {
  public static void main(String[] args){
    int month = 1;
    System.out.println("The month is " + month);

    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println("The month of" + month + " has 31 days");
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        System.out.println("The month of" + month + " has 30 days");
        break;
      case 2:
        System.out.println("The month of" + month + " has 28 days");
        break;
    }
  }
}
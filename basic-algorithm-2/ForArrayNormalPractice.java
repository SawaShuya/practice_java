public class ForArrayNormalPractice {
  public static void main(String[] args) {
    int[] points = {
      69, 40, 88, 68, 13, 62, 45, 43, 28, 69,
      54, 77, 81, 34, 41, 78, 59, 21, 45, 64,
      55, 18, 63, 80, 64, 26, 52, 44, 61, 50,
      44, 82, 56, 74, 67, 98, 58, 84, 77, 70,
      60, 77, 64, 89, 59, 74, 21, 66, 85, 68,
      90, 48, 64, 80, 63, 47, 70, 79, 51, 66,
      23, 84, 57, 57, 76, 60, 100, 66, 79, 61,
      47, 66, 76, 45, 90, 69, 72, 51, 86, 64,
      57, 51, 42, 60, 71, 69, 7, 62, 77, 61,
      43, 50, 68, 30, 78, 58, 40, 62, 70, 22
    };


    int count[] = new int[10];
    double sum = 0;

    for (int i = 0; i < points.length; i++) {
      if (points[i] >= 90) {
        count[9]++;
      } else if (points[i] >= 80) {
        count[8]++;
      } else if (points[i] >= 70) {
        count[7]++;
      } else if (points[i] >= 60) {
        count[6]++;
      } else if (points[i] >= 50) {
        count[5]++;
      } else if (points[i] >= 40) {
        count[4]++;
      } else if (points[i] >= 30) {
        count[3]++;
      } else if (points[i] >= 20) {
        count[2]++;
      } else if (points[i] >= 10) {
        count[1]++;
      } else {
        count[0]++;
      }
      sum += points[i];
    }

    System.out.println("The average is " + sum / points.length);
    System.out.println("Histogram:");

    for(int i = 0; i < count.length; i++) {
      System.out.print("Grade ");
      if (i == 0){
        System.out.print(" " + (i * 10) + ":");
      } else {
        System.out.print((i * 10) + ":");
      }

      for (int j = 0; j < count[i]; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    
    
  }
}
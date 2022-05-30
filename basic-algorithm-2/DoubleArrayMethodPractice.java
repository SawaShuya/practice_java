public class DoubleArrayMethodPractice {
  public static void main(String[] args){
    int[][] arr = {{1, 5, 8}, {2, 4, 7}, {1, 9, 3, 5}, {4, 2},
                            {6, 1, 9, 4}, {7, 3, 8, 1}, {8, 4, 3, 9, 7}};

    int target = 7;

    System.out.println("The target is " + target + "\ncounts in the array" + count(arr, target));



  }

  public static int count(int[][] arr, int target) {
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == target) {
          count++;
        }
      }
    }

    return count;
  }

}
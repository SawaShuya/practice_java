public class ArrayMethodPractice2 {

  public static void main(String[] args){
    int[] arr = {43, 2, 765, 234, 908, 115, 32,
      476, 938, 65, 93, 47, 102, 735,
      529, 1010, 639, 660, 182, 908};


      System.out.println("max of arr: " + max(arr));
  }

  public static int max(int[] arr) {
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    return max;
  }
}

public class StringArrayPractice {
  public static void main(String[] args) {
    String[][] apartment = {
      {"後藤", "矢口", "石川", "吉澤", "藤本"},
      {"亀井", "小川", "紺野"},
      {"石川", "安部", "安田", "後藤"},
      {"石黒", "福田", "後藤"}
    };

    System.out.println("enter search name");

    String name = System.console().readLine();
    int count = 0;

    for (int i = 0; i < apartment.length; i++) {
      for (int j = 0; j < apartment[i].length; j++) {
        if (apartment[i][j].equals(name)) {
          count++;

          System.out.println("No."+ count + " " + name + " in floor " + (i+1) + " room " + (j+1));
        }
      }
    }
    if (count == 0) {
      System.out.println(name + " not found");
    }
  }
}
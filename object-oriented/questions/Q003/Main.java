public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "田中";
        s1.score = 80;

        s2.name = "鈴木";
        s2.score = 90;

        s1.showScore();
        s2.showScore();
    }
}
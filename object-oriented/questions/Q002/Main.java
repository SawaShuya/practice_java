public class Main {
    public static void main(String[] args) {
        Shop s1 = new Shop();
        Shop s2 = new Shop();

        s1.name = "パン屋";
        s2.name = "洋服屋";

        s1.sale = 10000;
        s2.sale = 20000;

        System.out.println(s1.name + "の売上は" + s1.sale + "円です。");
        System.out.println(s2.name + "の売上は" + s2.sale + "円です。");
    }
}
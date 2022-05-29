import java.util.*;

public class Main {
    public static void main(String[] args) {

      Book book = createBook();
      NoteBook notebook = createNoteBook();

      int type = 0;
      Scanner scanner = new Scanner(System.in);
      do {
        System.out.println("1. 本の情報を表示 / 2. ノートの情報表示 / 3. ノートに追加書き込み / 4. 終了");
        type = scanner.nextInt();
        judgeType(type, book, notebook, scanner);
      } while (type != 4);
      
    }

    private static Book createBook() {
        System.out.println("本のページ数を入力してください");
        Scanner scanner = new Scanner(System.in);
        int page = scanner.nextInt();

        System.out.println("本の価格を入力してください");
        int price = scanner.nextInt();

        Book book = new Book(page, price);

        return book;
    }


    private static NoteBook createNoteBook() {
      System.out.println("ノートのページ数を入力してください");
      Scanner scanner = new Scanner(System.in);
      int page = scanner.nextInt();

      System.out.println("ノートの価格を入力してください");
      int price = scanner.nextInt();

      System.out.println("内容を入力してください");
      String content = scanner.next();

      NoteBook notebook = new NoteBook(page, price, content);

      return notebook;
    }

    private static void judgeType(int type, Book book, NoteBook notebook, Scanner scanner) {
      if (type == 1) {
        System.out.println("本のページ数: " + book.getPage() + "\n本の価格: " + book.getPrice());
      } else if (type == 2) {
        System.out.println("ノートのページ数: " + notebook.getPage() + "\nノートの価格: " + notebook.getPrice() + "\n内容: " + notebook.getContent());
      } else if (type == 3) {
        System.out.println("追加したい内容を入力してください");
        String content = scanner.next();
        notebook.addContent(content);
      } else if (type == 4) {
        System.out.println("アプリを終了します");
      } else {
        System.out.println("1~4の数字を入力してください");
      }
    }
}
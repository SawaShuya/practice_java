public class NoteBook extends Book {
    private String content;

    public NoteBook(int page,int price, String content) {
        super(page, price);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void addContent(String content) {
        this.content += content;
    }

}
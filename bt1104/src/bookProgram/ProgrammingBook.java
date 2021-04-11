package bookProgram;

public class ProgrammingBook extends Book {
    private String language;
    private String frameWork;

    public ProgrammingBook(String language, String frameWork) {
        this.language = language;
        this.frameWork = frameWork;
    }

    public ProgrammingBook(String language, String frameWork,String bookCode, String name, int price, String author ) {
        super(bookCode, name, price, author);
        this.language = language;
        this.frameWork = frameWork;
    }

    public ProgrammingBook() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFrameWork() {
        return frameWork;
    }

    public void setFrameWork(String frameWork) {
        this.frameWork = frameWork;
    }
    @Override
    public String toString() {
        return kind()+"{ code: "+super.getBookCode()+",name: "+super.getName()+", price: "+super.getPrice()+", author: "+super.getAuthor()+", language: "+language+", frame work :"+frameWork+"}";
    }
    public String kind(){
        return "Programming";
    }
}

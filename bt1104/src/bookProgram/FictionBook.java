package bookProgram;

public class FictionBook extends Book{
    private String category;

    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook( String category,String bookCode, String name, int price, String author) {
        super(bookCode, name, price, author);
        this.category = category;
    }
    public FictionBook() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return kind()+"{ code: "+super.getBookCode()+" , name: "+super.getName()+", price: "+super.getPrice()+", author: "+super.getAuthor()+", category: "+category+"}";
    }
    public String kind(){
        return "Fiction";
    }
}

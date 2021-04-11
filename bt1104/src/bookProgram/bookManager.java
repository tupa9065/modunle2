package bookProgram;

import java.util.Scanner;

public class bookManager {
    static String bookCode="";
    static String name="";
    static int price=0;
    static String author="";
    static String language="";
    static String frameWork="";
    static String category="";
    static Scanner sc = new Scanner(System.in);

    public static void inputBook(){
        System.out.println("book code ");
        bookCode = sc.nextLine();
        System.out.println("name ");
        name = sc.nextLine();
        System.out.println(" price ");
        price = sc.nextInt();
        System.out.println(" author ");
        author = sc.nextLine();
    }
    public static Book inputProgrammingBook(){
        inputBook();
        System.out.println("language ");
        language = sc.nextLine();
        System.out.println("frame work ");
        frameWork = sc.nextLine();
        return new ProgrammingBook(language,frameWork,bookCode,name,price,author);
    }
    public static Book inputFictionBook(){
        inputBook();
        System.out.println("category ");
        category = sc.nextLine();
        return new FictionBook(category,bookCode,name,price,author);
    }
public static int totalPrice(Book[] books){
    int total = 0;
    for (Book book:books
         ) {
        total+=book.getPrice();

    }
    return  total;
}
    public static int totalLanguage(Book[] books,String str){
        int count = 0;
        ProgrammingBook[] programmingBooks = new ProgrammingBook[5];
        int i=0;
        for (Book book:books) {
            if (book.kind().equals("Programming")){
                programmingBooks[i]= (ProgrammingBook) book;
                i++;
            }
        }
        for (ProgrammingBook programmingBook:programmingBooks) {
            if (programmingBook.getLanguage().equals(str)){
             count++;
            }
        }
        return  count;
    }
    public static void displayBookList(Book[] books){
        for (Book book:books) {
            System.out.println(book);
        }
    }
    public static void  softByPrice(Book[] books){
        for (int i =0; i<books.length;i++) {
            for (int j =i+1; j<books.length;j++){
                if (books[i].getPrice()>books[j].getPrice()){
                    Book temp = new Book();
                    temp =books[i];
                    books[i]=books[j];
                    books[j]=temp;
                }
            }
        }
        displayBookList(books);
    }
}

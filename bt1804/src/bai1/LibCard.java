package bai1;

import java.util.Scanner;

public class LibCard {
    private String cardID;
    private String dateOfHire;
    private String leaseTerm;
    private String bookID;
    private Student student =new Student();
    Scanner scanner = new Scanner(System.in);
    public LibCard(String idCard, String dateOfHire, String leaseTerm, String numOfBook, Student student) {
        this.cardID = idCard;
        this.dateOfHire = dateOfHire;
        this.leaseTerm = leaseTerm;
        this.bookID = numOfBook;
        this.student = student;
    }

    public LibCard() {
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(String dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public String getLeaseTerm() {
        return leaseTerm;
    }

    public void setLeaseTerm(String leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;

    }
    @Override
    public String toString() {
        return "LibCard{" +
                "idCard='" + cardID + '\'' +
                ", dateOfHire='" + dateOfHire + '\'' +
                ", leaseTerm='" + leaseTerm + '\'' +
                ", numOfBook='" + bookID + '\'' +
                ", student=" + student +
                '}';
    }
    public  void  insertLibCard(){

        System.out.println("Id card");
        this.setCardID(scanner.nextLine());
        System.out.println("date of hire");
        this.setDateOfHire(scanner.nextLine());
        System.out.println("lease term");
        this.setLeaseTerm(scanner.nextLine());
        System.out.println("book id");
        this.setBookID(scanner.nextLine());
        this.student.insertStudent();
    }


}

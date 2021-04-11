package bookProgram;

import java.util.Scanner;

public class bookMain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0]=new ProgrammingBook("Java","1","1","1",7,"1");
        books[1]=new ProgrammingBook("C","1","2","1",1,"1");
        books[2]=new ProgrammingBook("C++","1","3","1",8,"1");
        books[3]=new ProgrammingBook("Java","1","4","1",3,"1");
        books[4]=new ProgrammingBook("Javascrip","1","5","1",5,"1");
        books[5]=new FictionBook("1","1","1",2,"1");
        books[6]=new FictionBook("1","1","1",4,"1");
        books[7]=new FictionBook("1","1","1",1,"1");
        books[8]=new FictionBook("1","1","1",1,"1");
        books[9]=new FictionBook("1","1","1",5,"1");
//        for (int i = 0; i < 5; i++) {
//            Book temp = bookManager.inputProgrammingBook();
//            books[i] = temp;
//        }
//        for (int i = 5; i < books.length; i++) {
//           Book temp = bookManager.inputFictionBook();
//            books[i] = temp;
//        }
        int choice =-1;
        while (choice!=0){
            System.out.println("1.hien thi danh sach ");
            System.out.println("2.thanh toan tien ");
            System.out.println("3. tim so sach theo langguage ");
            System.out.println("4.sap sep theo gia ");
            System.out.println("0.thoat chuong trinh ");
            System.out.println("Lua chon cua ban ");
            choice= sc.nextInt();
            switch (choice){
                case 1 :{
                    bookManager.displayBookList(books);
                    break;
                }
                case 2 :{
                    System.out.println("tong tien "+bookManager.totalPrice(books));
                    break;
                }
                case 3 :{
                    //System.out.println("nhap ngon ngu");
                    //String str = sc.nextLine();
                    String str="Java";
                    System.out.println("so sach "+str+" : "+bookManager.totalLanguage(books,str));

                    break;
                }
                case 4 :{
                    bookManager.softByPrice(books);
                    break;
                }
                case 0 :{
                    System.exit(0);
                }
                default :{
                    System.out.println("lua chon khong hop le");
                }
            }

        }

    }


}


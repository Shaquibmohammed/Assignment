package College;

import java.util.Scanner;

public class LibraryManageSys {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Library library=new Library();
        while(true){
            System.out.println("1. Add Book");
            System.out.println("2. View Book");
            System.out.println("3. searchBook");
            System.out.println("4. removeBook");
            System.out.println("5. Exit");

            int choice=sc.nextInt();
            if(choice==1){
                sc.nextLine();
                System.out.println("Enter id: ");
                int id=sc.nextInt();

                System.out.println("Enter title: ");
                String bookTitle=sc.nextLine();

                System.out.println("Enter Author: ");
                String author=sc.nextLine();

                System.out.println("Enter genre");
                String genre=sc.nextLine();

                System.out.println("Enter avaibility: ");
                boolean availability=sc.nextBoolean();
                library.addBook(new Book(id,bookTitle,author,genre,availability));
            }
            else if(choice==2){
                library.viewBook();
            }
            else if(choice==3){
                library.searchBook(sc.nextInt());
            } else if (choice==4) {
                sc.nextLine();
                System.out.println("Entre genre: ");
                String genre=sc.nextLine();
                library.removeBook(genre);
            }
            else{
                break;
            }
        }
        sc.close();
    }
}

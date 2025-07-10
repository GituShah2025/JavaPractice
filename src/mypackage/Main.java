package mypackage;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Library library = new Library();
        Scanner scan = new Scanner(System.in);
        library.listAllBooks();
        loop_label: while (true)
        {
            System.out.println("\nLibrary");
            System.out.println("1. Add Book:");
            System.out.println("2. List Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Search Book");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    Book book1 = new Book("Pride and Prejudice", "Jane Austen", "9780000000003", 1813);
                    Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780000000004", 1925);
                    Book book3 = new Book("Brave New World", "Aldous Huxley", "9780000000007", 1932);
                    Book book4 = new Book("Fahrenheit 451", "Ray Bradbury", "9780000000009", 1953);
                    library.addBook(book1);
                    library.addBook(book2);
                    library.addBook(book3);
                    library.addBook(book4);
                    library.addBook(enterBookDetails(scan));
                    break;
                case 2:
                    library.listAllBooks();
                    break;
                case 3:
                    System.out.print("Enter the name of the book to remove: ");
                    String bookTitleRmv = scan.nextLine();
                    library.removeBook(bookTitleRmv);
                    break;
                case 4:
                    System.out.print("Enter author name to start search: ");
                    String bookAuthorSrch = scan.nextLine();
                    library.searchByauthor(bookAuthorSrch);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break loop_label;

            }
        }
        scan.close();
    }

    private static Book enterBookDetails(Scanner scan)
    {
        System.out.println("Enter Title: ");
        String title = scan.nextLine();
        System.out.println("Enter Author: ");
        String author = scan.nextLine();
        System.out.println("Enter ISBN: ");
        String isbn = scan.nextLine();
        System.out.println("Enter Year: ");
        int yr = scan.nextInt();
        return new Book(title, author, isbn, yr);
    }

}
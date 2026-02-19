package mypackage;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Library library = new Library();
        Scanner scan = new Scanner(System.in);
        System.out.println("Listing All Books");
        library.listAllBooks();
        Book book1 = new Book("Pride and Prejudice", "Jane Austen", "9780000000003", 1813);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780000000004", 1925);
        Book book3 = new Book("Brave New World", "Aldous Huxley", "9780000000007", 1932);
        Book book4 = new Book("Fahrenheit 451", "Ray Bradbury", "9780000000009", 1953);
        loop_label: while (true)
        {
            System.out.println("\nLibrary");
            System.out.println("1. Add Book:");
            System.out.println("2. List Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Search Book");
            System.out.println("5. Enter Exit if choice is not as above: ");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    library.addBook(book1);
                    library.addBook(book2);
                    library.addBook(book3);
                    library.addBook(book4);
                    System.out.print("Add books? Y/N: ");
                    String ans = scan.nextLine();
                    if(ans.equalsIgnoreCase("Y"))
                    {
                        System.out.println("Enter Title: ");
                        String title = scan.nextLine();
                        if(title.equalsIgnoreCase(book1.getTitle()) ||
                          (title.equalsIgnoreCase(book2.getTitle()) ||
                          (title.equalsIgnoreCase(book3.getTitle()) ||
                          (title.equalsIgnoreCase(book4.getTitle())))))
                        {
                            System.out.println("We have the same book in the library");
                        }
                        else
                        {
                            library.addBook(enterBookDetails(scan));
                            break;
                        }
                    }
                    else
                    {
                        System.out.print("You have selected N so books are not added");
                        String bksNo = scan.nextLine();
                    }
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
                case 5:
                     System.out.print("Good bye, Exiting the loop");
                    break loop_label;
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
        return new Book(title,author, isbn, yr);
        }
    }


package mypackage;

import java.util.ArrayList;
import java.util.Iterator;

public class Library
{
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book)
    {
        books.add(book);
        System.out.println("Book is added:" + book);
    }

    public void removeBook(String title)
    {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext())
        {
            Book book = iterator.next();
            if (book.getTitle().equals(title))
            {
                iterator.remove();
                System.out.println("Book is removed:" + book);
                return;
            }
            else
            {
                System.out.println("Book is not found" + title);
            }
        }
    }

    public void searchByauthor(String author)    {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext())
        {
            Book book = iterator.next();
            if (book.getAuthor().equals(author))
            {
                System.out.println("Search is complete:" + book);
                return;
            }
            else
            {
                System.out.println("Book is not found" + author);
            }
        }
    }

    public void listAllBooks()
    {
        if (books.isEmpty())
        {
            System.out.println("Out of books, unavailable");
        }
        else
        {
            for (Book book : books)
            {
                System.out.println("List of all the books available:" + book);
            }
        }
    }
}

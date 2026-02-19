package mypackage;

public class Book {
 //Field
 private String title;
 private String author;
 private String isbn;
 private int year;

 public Book (String inTitle, String inAuthor, String inIsbn, int inYr)
 {
  this.title = inTitle;
  this.author = inAuthor;
  this.isbn = inIsbn;
  this.year = inYr;
 }

 public String getTitle()
 {
  return title;
 }

 public void setTitle(String inTitle)
 {
  this.title = inTitle;
 }

 public String getAuthor()
 {
  return author;
 }

 public void setAuthor(String inAuthor)
 {
  this.author = inAuthor;
 }

 public String getIsbn()
 {
  return isbn;
 }

 public void setIsbn(String inIsbn)
 {
  this.isbn = inIsbn;
 }

 public int getYear()
 {
  return year;
 }

 public void setYear(int inYr)
 {
  this.year = inYr;
 }
 @Override
 public String toString()
 {
  return "Title:"+this.title +" "+ "Author:" + this.author +" "+ "ISBN:"+this.isbn +" "+"Year:" +this.year;
 }
}

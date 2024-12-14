package HomeAssignmentweek1.day2;
//Library.java
public class Library {

 // Method to add a book
 public String addBook(String bookTitle) {
     // Printing confirmation message
     System.out.println("Book added successfully: " + bookTitle);
     // Returning the book title
     return bookTitle;
 }

 // Method to issue a book
 public void issueBook() {
     // Printing confirmation message
     System.out.println("Book issued successfully");
 }


//LibraryManagement.java

 public static void main(String[] args) {
     // Creating an object of the Library class
     Library library = new Library();
     
     // Calling addBook() method
     String bookTitle = library.addBook ("Friends");
     
     // Calling issueBook() method
     library.issueBook();
 }
}



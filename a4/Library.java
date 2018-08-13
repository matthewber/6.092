import java.util.*;

public class Library {

  String address;
  LinkedList<Book> books;
  ListIterator<Book> iterator;

  public Library(String address){
    this.books = new LinkedList<Book>();
    this.address = address;
  }
  public void addBook(Book newbook){
    books.add(newbook);
  }
  public void printAddress(){
    System.out.print(address);
  }
  public void borrowBook(String bookName){
    iterator = books.listIterator(0);
    Book currBook;
    while(iterator.hasNext()){
      currBook = iterator.next();
      if(bookName.equals(currBook.title)){
        currBook.borrowed = true;
        System.out.println("You successfully borrowed " + currBook.getTitle());
        break;
      }
    }
  }

  public void returnBook(String bookName){
    iterator = books.listIterator(0);
    Book currBook;
    while(iterator.hasNext()){
      currBook = iterator.next();
      if(bookName.equals(currBook.title)){
        currBook.borrowed = false;
        System.out.println("You successfully returned " + currBook.getTitle());
        break;
      }
    }
  }

  public void printAvailableBooks(){
    if(books.size() == 0){
      System.out.print("No book in catalog");
    }else{
      iterator = books.listIterator(0);
      Book currBook;
      while(iterator.hasNext()){
        currBook = iterator.next();
        currBook.printTitle();
      }
    }
  }

  public static void printOpeningHours(){
    System.out.print("Libraries are open daily from 9am to 5pm.");
  }


  public static void main(String[] args) {
    // Create two libraries
    Library firstLibrary = new Library("10 Main St.");
    Library secondLibrary = new Library("228 Liberty St.");
    // Add four books to the first library
    firstLibrary.addBook(new Book("The Da Vinci Code"));
    firstLibrary.addBook(new Book("Le Petit Prince"));
    firstLibrary.addBook(new Book("A Tale of Two Cities"));
    firstLibrary.addBook(new Book("The Lord of the Rings"));
    // Print opening hours and the addresses
    System.out.println("Library hours:");
    printOpeningHours();
    System.out.println();
    System.out.println("Library addresses:");
    firstLibrary.printAddress();
    secondLibrary.printAddress();
    System.out.println();
    // Try to borrow The Lords of the Rings from both libraries
    System.out.println("Borrowing The Lord of the Rings:");
    firstLibrary.borrowBook("The Lord of the Rings");
    firstLibrary.borrowBook("The Lord of the Rings");
    secondLibrary.borrowBook("The Lord of the Rings");
    System.out.println();
    // Print the titles of all available books from both libraries
    System.out.println("Books available in the first library:");
    firstLibrary.printAvailableBooks();
    System.out.println();
    System.out.println("Books available in the second library:");
    secondLibrary.printAvailableBooks();
    System.out.println();
    // Return The Lords of the Rings to the first library
    System.out.println("Returning The Lord of the Rings:");
    firstLibrary.returnBook("The Lord of the Rings");
    System.out.println();
    // Print the titles of available from the first library
    System.out.println("Books available in the first library:");
    firstLibrary.printAvailableBooks();
  }
}

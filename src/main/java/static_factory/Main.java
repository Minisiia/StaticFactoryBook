package static_factory;

/**
 * You need to create a Book class, which represents a book with a title, author, and year of publication.
 * To create an instance of the Book class, you should use a static factory called BookFactory, which will have the following methods:
 * 1. createBookWithTitle(String title, String author) - creates a book with the given title and author, the year of publication will be set to the current year.
 * 2. createBookWithTitleAndYear(String title, String author, int year) - creates a book with the given title, author, and year of publication.
 * Your task is to create the Book class and the BookFactory static factory with the specified methods.
 * After that, you should create several instances of the Book class using different static factory methods.
 */

public class Main {
    public static void main(String[] args) {
        Book book1 = BookFactory.createBookWithTitle("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = BookFactory.createBookWithTitleAndYear("To Kill a Mockingbird", "Harper Lee", 1960);
        System.out.println(book1);
        System.out.println(book2);

    }
}

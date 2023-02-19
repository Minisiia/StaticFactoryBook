package static_factory;

import java.util.Calendar;

public class BookFactory {

    /**
     * Creates a new book with the given title and author, using the current year as the year of publication.
     *
     * @param title the title of the book.
     * @param author the author of the book.
     * @return a new instance of the Book class with the given title, author, and current year of publication.
     */
    public static Book createBookWithTitle(String title, String author) {
        Calendar calendar = Calendar.getInstance();
        return new Book(title,author,calendar.get(Calendar.YEAR));
    }

    /**
     * Creates a new book with the given title, author, and year of publication.
     *
     * @param title the title of the book.
     * @param author the author of the book.
     * @param year the year of publication.
     * @return a new instance of the Book class with the given title, author, and year of publication.
     */
    public static Book createBookWithTitleAndYear(String title, String author, int year) {
        return new Book(title,author,year);
    }
}

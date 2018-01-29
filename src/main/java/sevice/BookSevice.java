package sevice;

import model.Book;

import java.util.List;

/**
 * Created by DELL on 1/29/2018.
 */
public interface BookSevice {
    public void addBook(Book book);

    public void updateBook(Book book);

    public void removeBook(Book book);

    public Book getBookById(int id);

    public List<Book> getListBooks();

}

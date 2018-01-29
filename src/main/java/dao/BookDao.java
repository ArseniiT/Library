package dao;

import model.Book;

import java.util.List;

/**
 * Created by DELL on 1/29/2018.
 */
public interface BookDao {
    public void addBook(Book book);

    public void updateBook(Book book);

    public void removeBook(int id);

    public Book getBookById(int id);

    public List<Book> getListBooks();
}

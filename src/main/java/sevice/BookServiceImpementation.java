package sevice;

import dao.BookDao;
import model.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpementation implements BookSevice{

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Transactional
    public void addBook(Book book) {

    }

    public void updateBook(Book book) {

    }

    public void removeBook(Book book) {

    }

    public Book getBookById(int id) {
        return null;
    }

    public List<Book> getListBooks() {
        return null;
    }
}

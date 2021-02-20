package org.tutorial;

import java.sql.SQLException;
import java.util.List;

public class BookServiceImpl implements BookService{

    private BookDAO bookDao = new BookDAOImpl();

    @Override
    public List<Book> getAllBooks() throws SQLException {
        return bookDao.findByAll();
    }

}

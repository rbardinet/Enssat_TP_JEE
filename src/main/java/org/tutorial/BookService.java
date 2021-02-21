package org.tutorial;

import java.sql.SQLException;
import java.util.List;

public interface BookService {
    public List<Book> getAllBooks() throws SQLException;
    public List<Book> getBooksByTitle(String searchText) throws SQLException;
}

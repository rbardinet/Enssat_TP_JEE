package org.tutorial;

import java.sql.SQLException;
import java.util.List;

public interface BookService {
    List<Book> getAllBooks() throws SQLException;
}

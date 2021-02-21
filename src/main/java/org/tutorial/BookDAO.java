package org.tutorial;

import java.sql.SQLException;
import java.util.List;

public interface BookDAO {
    List<Book> findByAll() throws SQLException;
    List<Book> findByTitle(String searchText) throws SQLException;
    List<Book> findByAut(String searchText) throws SQLException;
}

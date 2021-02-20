package org.tutorial;

import java.sql.SQLException;
import java.util.List;

public class BookDAOImpl implements BookDAO{
    @Override
    public List<Book> findByAll() throws SQLException {
        java.sql.Connection connexion = DBManager.getInstance().getConnection();
        java.sql.Statement statement = connexion.createStatement();
        java.sql.ResultSet rs = statement.executeQuery("select ...") ;
    }
}

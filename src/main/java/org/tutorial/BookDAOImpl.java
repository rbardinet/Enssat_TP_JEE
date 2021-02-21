package org.tutorial;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookDAOImpl implements BookDAO{
    @Override
    public List<Book> findByAll() throws SQLException {

        java.sql.Connection connexion = DBManager.getInstance().getConnection();
        java.sql.Statement statement = connexion.createStatement();
        java.sql.ResultSet rs = statement.executeQuery("select * from books where author='Bruce Eckel'");

        List<Book> Res = new ArrayList<Book>();
        int ID;
        String Author;
        String Title;

        while (rs.next()){
            System.out.println(rs.getString(1));
            Title = rs.getString("title");
            Author = rs.getString("author");
            ID = rs.getInt("id");
            System.out.println("title = "+Title+", author = "+Author+", ID = "+ID);
            Book book = new Book(ID,Title,Author);
            Res.add(book);
        }

        return Res;
    }
}

package org.tutorial;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class BookDAOImpl implements BookDAO{
    @Override
    public List<Book> findByAll() throws SQLException {

        java.sql.Connection connexion = DBManager.getInstance().getConnection();
        java.sql.Statement statement = connexion.createStatement();
        java.sql.ResultSet rs = statement.executeQuery("select * from books where author='author1'");

        List<Book> Res = Arrays.asList(new Book[]{});
        int ID;
        String Author;
        String Title;

        while (rs.next()){
            System.out.println(rs.getString(1));
            Title = rs.getString("title");
            Author = rs.getString("author");
            ID = rs.getInt("id");
            Res.add(new Book(ID,Title,Author));
        }

        return Res;
    }
}

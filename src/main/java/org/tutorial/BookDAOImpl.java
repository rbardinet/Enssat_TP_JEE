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
        java.sql.ResultSet rs = statement.executeQuery("select * from books");

        List<Book> Res = new ArrayList<Book>();
        int ID;
        String Author;
        String Title;
        int nbRes = 0;

        while (rs.next()){
            //System.out.println(rs.getString(1));
            Title = rs.getString("title");
            Author = rs.getString("author");
            ID = rs.getInt("id");
            System.out.println("title = "+Title+", author = "+Author+", ID = "+ID);
            Book book = new Book(ID,Title,Author);
            Res.add(book);
            nbRes+=1;
        }

        Res.add(new Book(-1,String.valueOf(nbRes),"7é8fskjhjkhkhjbf_é&zdjqk"));

        return Res;
    }

    @Override
    public List<Book> findByTitle(String searchText) throws SQLException {
        java.sql.Connection connexion = DBManager.getInstance().getConnection();
        java.sql.Statement statement = connexion.createStatement();
        System.out.println("select * from books where title = '"+searchText+"'");
        java.sql.ResultSet rs = statement.executeQuery("select * from books where title = '"+searchText+"'");

        List<Book> Res = new ArrayList<Book>();
        int ID;
        String Author;
        String Title;
        int nbRes = 0;

        while (rs.next()){
            //System.out.println(rs.getString(1));
            Title = rs.getString("title");
            Author = rs.getString("author");
            ID = rs.getInt("id");
            System.out.println("title = "+Title+", author = "+Author+", ID = "+ID);
            Book book = new Book(ID,Title,Author);
            Res.add(book);
            nbRes+=1;
        }

        Res.add(new Book(-1,String.valueOf(nbRes),"7é8fskjhjkhkhjbf_é&zdjqk"));

        return Res;
    }

    @Override
    public List<Book> findByAut(String searchText) throws SQLException {
        java.sql.Connection connexion = DBManager.getInstance().getConnection();
        java.sql.Statement statement = connexion.createStatement();
        System.out.println("select * from books where title = '"+searchText+"'");
        java.sql.ResultSet rs = statement.executeQuery("select * from books where author = '"+searchText+"'");

        List<Book> Res = new ArrayList<Book>();
        int ID;
        String Author;
        String Title;
        int nbRes = 0;

        while (rs.next()){
            //System.out.println(rs.getString(1));
            Title = rs.getString("title");
            Author = rs.getString("author");
            ID = rs.getInt("id");
            System.out.println("title = "+Title+", author = "+Author+", ID = "+ID);
            Book book = new Book(ID,Title,Author);
            Res.add(book);
            nbRes+=1;
        }

        Res.add(new Book(-1,String.valueOf(nbRes),"7é8fskjhjkhkhjbf_é&zdjqk"));

        return Res;

    }
}

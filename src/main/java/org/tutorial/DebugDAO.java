package org.tutorial;

import java.sql.SQLException;
import java.util.List;

public class DebugDAO {
    public static void main(String[] args) throws SQLException {
        BookDAOImpl debug = new BookDAOImpl();
        List<Book> ListTest = debug.findByAll();

        for(int i=0; i < ListTest.size(); i++){
            System.out.println( ListTest.get(i).getAuthor() );
        }

    }
}

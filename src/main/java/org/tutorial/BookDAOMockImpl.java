package org.tutorial;

import java.util.Arrays;
import java.util.List;

public class BookDAOMockImpl implements BookDAO{
    @Override
    public List<Book> findByAll() {

        Book Livre1 = new Book(1,"titre1","author1");
        Book Livre2 = new Book(2,"titre2","author2");
        Book Livre3 = new Book(3,"titre3","author3");

        List<Book> Res = Arrays.asList(new Book[]{Livre1, Livre2, Livre3});

        return Res;

    }
}

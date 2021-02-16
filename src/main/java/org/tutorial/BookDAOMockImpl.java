package org.tutorial;

import java.util.List;

public class BookDAOMockImpl implements BookDAO{

    public List<Book> findByAll() {

        List res = null;

        Book livre1 = null;
        livre1.setAuthor("Flanders");
        livre1.setId(1);
        livre1.setTitle("Holy Bible");

        Book livre2 = null;
        livre2.setAuthor("Flanders2");
        livre2.setId(2);
        livre2.setTitle("Holy Bible2");

        res.add(livre1);
        res.add(livre2);

        return res;
    }
}

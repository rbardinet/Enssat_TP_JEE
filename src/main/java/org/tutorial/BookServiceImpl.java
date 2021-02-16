package org.tutorial;

import java.util.List;

public class BookServiceImpl implements BookService{

    private BookDAO bookDao = new BookDAOMockImpl();

    @Override
    public List<Book> getAllBooks() {
        return BookDAO.findByAll();
    }
}

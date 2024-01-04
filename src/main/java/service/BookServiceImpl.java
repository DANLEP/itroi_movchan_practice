package service;

import jakarta.jws.WebService;
import model.Book;

import java.util.*;

@WebService(serviceName="BookServiceImpl",
        portName="BookPort",
        endpointInterface="service.BookService",
        targetNamespace="http://service/")
public class BookServiceImpl implements BookService {
    private Map<Integer, Book> books;
    private int currentId;

    public BookServiceImpl() {
        books = new HashMap<>();
        currentId = 0;
    }

    @Override
    public Book getBook(int id) {
        return books.get(id);
    }

    @Override
    public List<Book> getBooks() {
        return books.values().stream().toList();
    }

    @Override
    public List<Book> getBooks(String bookName) {
        System.out.println(bookName);
        return books.values().stream().filter(book -> book.getName().equals(bookName)).toList();
    }

    @Override
    public int addBook(Book book) {
        int newId = ++currentId;
        book.setId(newId);
        books.put(newId, book);

        return newId;
    }

    @Override
    public int removeBook(int id) {
        Book removedBook = books.remove(id);

        return  (removedBook == null) ? 0 : 1;
    }

    @Override
    public void updateBook(Book book) {
        books.put(book.getId(), book);
    }
}

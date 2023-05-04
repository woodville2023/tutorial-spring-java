package learn.nara.books.service;

import learn.nara.books.model.Book;

import java.util.List;

public interface BookService {

  Book addBook(Book book);

  List<Book> getAllBook();

  List<Book> getByAuthor(String author);

  List<Book> getByTitle(String title);
}

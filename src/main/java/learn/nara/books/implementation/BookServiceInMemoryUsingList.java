package learn.nara.books.implementation;

import learn.nara.books.model.Book;
import learn.nara.books.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Scope("singleton")
@Qualifier("bookServiceInMemoryUsingList")
public class BookServiceInMemoryUsingList implements BookService {
  private List<Book> bookList = new ArrayList<>();
  private static final Logger log = LoggerFactory.getLogger(BookServiceInMemoryUsingList.class);

  @Override
  public Book addBook(Book book) {
    book.setId(bookList.size() + 1);
    bookList.add(book);
    return book;
  }

  @Override
  public List<Book> getAllBook() {
    return bookList;
  }

  @Override
  public List<Book> getByAuthor(String author) {
    List<Book> results = new ArrayList<>();
    for(Book book: bookList){
      if(book.getAuthor().toUpperCase().contains(author.toUpperCase())) {
        results.add(book);
      }
    }
    return results;
  }

  @Override
  public List<Book> getByTitle(String title) {
    List<Book> results = new ArrayList<>();
    for(Book book: bookList){
      if(book.getName().toUpperCase().contains(title.toUpperCase())) {
        results.add(book);
      }
    }
    return results;
  }
}

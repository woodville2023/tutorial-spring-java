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
@Qualifier("bookServiceInMemoryUsingArray")
public class BookServiceInMemoryUsingArray implements BookService {
  private Book [] bookArr = new Book[10];
  
  private static final Logger log = LoggerFactory.getLogger(BookServiceInMemoryUsingArray.class);
  @Override
  public Book addBook(Book book) {
    boolean bookAdded = false;
    for(int i =0 ;i< bookArr.length; i++){

      if(bookArr[i] == null){
        
        book.setId(1+i);
        bookArr[i] = book;
        bookAdded = true;
        break;
        
      }
    }

    if(!bookAdded){
        throw new RuntimeException("Only 10 books can be added ");
    }
    return book;
  }

  @Override
  public List<Book> getAllBook() {
    List<Book> result = new ArrayList<>();
    for (Book book : bookArr) {
         if(book == null){                                     
           continue;
         }
         result.add(book);
    }
    return result;
  }

  @Override
  public List<Book> getByAuthor(String author) {
    List<Book> results = new ArrayList<>();
    for(Book book: bookArr){
      if(book == null){
        continue;
      }
      if(book.getAuthor().toUpperCase().contains(author.toUpperCase())) {
        results.add(book);
      }
    }
    return results;
  }

  @Override
  public List<Book> getByTitle(String title) {

    List<Book> results = new ArrayList<>();

    for(Book book: bookArr){
      
      if(book == null){
        continue;
      }
      
      if(book.getName().toUpperCase().contains(title.toUpperCase())) {
        results.add(book);
      }
    }
    return results;
  }
}

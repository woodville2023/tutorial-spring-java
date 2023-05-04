package learn.nara.books.rest;

import learn.nara.books.model.Book;
import learn.nara.books.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("book")
public class BookRestService {

  @Autowired
  BookService bookServiceInMemoryUsingList;

  @Autowired
  BookService bookServiceInMemoryUsingArray;
  
  private static final Logger log = LoggerFactory.getLogger(BookRestService.class);

  @GetMapping(value = "",produces = "application/json")
  //@ResponseBody
  public ResponseEntity test(){
    return new ResponseEntity(Map.of("success","true"), HttpStatus.OK);
  }


 /* @PostMapping(value = "/add",consumes = "application/json", produces = "application/json")
  public Book addBook( @RequestBody  Book book){
    log.info("Inside addBook :{}",book);
    bookServiceInMemoryUsingArray.addBook(book);
    return book;
  }*/

  @PostMapping(value = "",consumes = "application/json", produces = "application/json")
  public Book addBook( @RequestBody  Book book){
    log.info("Inside addBook :{}",book);
    bookServiceInMemoryUsingArray.addBook(book);
    return book;
  }

  @GetMapping(value = "/all",consumes = "application/json", produces = "application/json")
  public List<Book> getAllBook( ){
    log.info("Inside rest getAllBook");
    
   return bookServiceInMemoryUsingArray.getAllBook();
  }



  


}

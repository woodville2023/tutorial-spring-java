package learn.nara.books.model;

public class Book {
  private String name;
  private String author;
  private int id;

  public String getName() {return name;}

  public void setName(String name) {this.name = name;}

  public String getAuthor() {return author;}

  public void setAuthor(String author) {this.author = author;}

  public int getId() {return id;}

  public void setId(int id) {this.id = id;}

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Book{");
    sb.append("name='").append(name).append('\'');
    sb.append(", author='").append(author).append('\'');
    sb.append(", id='").append(id).append('\'');
    sb.append('}');
    return sb.toString();
  }
}

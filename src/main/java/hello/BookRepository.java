package hello;

/**
 * Created by yuchen on 1/23/2017.
 */
public interface BookRepository {

    Book getByIsbn(String isbn);

}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.domain.PurchaseMovie;
import ru.netology.repository.ProductRepository;

import static org.mockito.Mockito.*;

public class ProductMangerTest {

    //    ProductRepository repo = new ProductRepository();
    ProductRepository repo = Mockito.mock(ProductRepository.class);
    ProductManager manager = new ProductManager(repo);

    PurchaseMovie movie1 = new PurchaseMovie(1, "movie 1");
    PurchaseMovie movie2 = new PurchaseMovie(23, "movie 2");
    PurchaseMovie movie3 = new PurchaseMovie(14, "movie 3");

//    @BeforeEach
//    public void setup() {
//        manager.add(movie1);
//        manager.add(movie2);
//        manager.add(movie3);
//    }

    @Test
    public void shouldReverseAllMovies() {
        PurchaseMovie[] movies = {movie1, movie2, movie3};
        doReturn(movies).when(repo).findAll();


        PurchaseMovie[] expected = {movie3, movie2, movie1};
        PurchaseMovie[] actual = manager.getMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

//    @Test
//    public void shouldReverseLastMovies() {
//        PurchaseMovie[] movies = {movie1, movie2, movie3};
//        doReturn(movies).when(repo).findAll();
//
//
//        PurchaseMovie[] expected = {movie3, movie2};
//        PurchaseMovie[] actual = manager.getLastMovie();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
}

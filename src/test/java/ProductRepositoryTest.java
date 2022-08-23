import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.domain.PurchaseMovie;
import ru.netology.repository.ProductRepository;

public class ProductRepositoryTest {

    PurchaseMovie movie1 = new PurchaseMovie(1, "movie 1");
    PurchaseMovie movie2 = new PurchaseMovie(23, "movie 2");
    PurchaseMovie movie3 = new PurchaseMovie(14, "movie 3");

    ProductRepository repo = new ProductRepository();

    @BeforeEach
    public void setup() {
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
    }

    @Test
    public void saveMovie() {

        PurchaseMovie[] expected = {movie1, movie2, movie3};
        PurchaseMovie[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeById() {

        repo.removeById(movie2.getId());

        PurchaseMovie[] expected = {movie1, movie3};
        PurchaseMovie[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeAll() {

        repo.removeAll();

        PurchaseMovie[] expected = {};
        PurchaseMovie[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findById() {

        PurchaseMovie[] expected = {movie1};
        PurchaseMovie[] actual = repo.findById(1);

        Assertions.assertArrayEquals(expected, actual);
    }
}

//    @ParameterizedTest
//    @CsvSource(delimiter ='|', value = {
//            "movie3|'expected'", 14})
//    public void findById(String[] expected, int id) {
//
////        repo.save(movie1);
////        repo.save(movie2);
////        repo.save(movie3);
//
////        PurchaseMovie[] expected = {movie3};
//        PurchaseMovie[] actual = repo.findById(id);
//
//        Assertions.assertArrayEquals(expected, actual);
//    }



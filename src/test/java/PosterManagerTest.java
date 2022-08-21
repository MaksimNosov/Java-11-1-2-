import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.afisha.PosterManager;

public class PosterManagerTest {
    PosterManager films = new PosterManager();

    @Test
    public void testFindAll() {


        films.save("Film 1");
        films.save("Film 2");
        films.save("Film 3");

        String[] actual = films.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {

        films.save("Film 1");
        films.save("Film 2");
        films.save("Film 3");
        films.save("Film 4");
        films.save("Film 5");
        films.save("Film 6");

        String[] actual = films.findLast();
        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLimit5() {

        PosterManager films = new PosterManager(5);

        films.save("Film 1");
        films.save("Film 2");
        films.save("Film 3");
        films.save("Film 4");
        films.save("Film 5");
        films.save("Film 6");

        String[] actual = films.findLast();
        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};

        Assertions.assertArrayEquals(expected, actual);
    }

}



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesTest {
    @Test
    public void test() {
        MoviesMan man = new MoviesMan();

        man.add("фильм 1");
        man.add("фильм 2");
        man.add("фильм 3");

        String[] expected = {"фильм 1", "фильм 2", "фильм 3"};
        String[] actual = man.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        MoviesMan man = new MoviesMan();

        man.add("фильм 1");
        man.add("фильм 2");
        man.add("фильм 3");

        String[] expected = {"фильм 3", "фильм 2", "фильм 1"};
        String[] actual = man.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        MoviesMan man = new MoviesMan(10);

        man.add("фильм 1");
        man.add("фильм 2");
        man.add("фильм 3");
        man.add("фильм 4");
        man.add("фильм 5");
        man.add("фильм 6");
        man.add("фильм 7");
        man.add("фильм 8");
        man.add("фильм 9");
        man.add("фильм 10");
        man.add("фильм 11");
        man.add("фильм 12");

        String[] expected = {"фильм 12", "фильм 11", "фильм 10", "фильм 9", "фильм 8", "фильм 7", "фильм 6", "фильм 5", "фильм 4", "фильм 3"};
        String[] actual = man.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

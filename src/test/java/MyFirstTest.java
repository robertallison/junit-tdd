import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;


public class MyFirstTest {

    @Test
    public void isTheSame() {
        String expected = "Codeup";
        String actual = "Codeup";
        assertNotEquals(expected, actual);
    }

    @Test
    public void areArrayTheSame() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void areArrayEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void trueOrFalse() {
        String language = "PHP";
        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }
}

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task3Test {
    private int age;
    private boolean expected;

    public Task3Test(int age, boolean expected) {
        this.age = age;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {17, false},
            {18, true},
            {19, true},
            {21, true}
        });
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean actual = program.checkIsAdult(age);
        assertEquals("Для возраста " + age + " ожидается " + expected,
                    expected, actual);
    }
}

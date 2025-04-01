import org.junit.Test;
import static org.junit.Assert.*;

public class Task2Test {
    @Test
    public void checkIsAdultWhenAgeIsLessThan18False() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(17);
        assertEquals("Ожидается false для возраста 17 лет (несовершеннолетний)",
                    false, isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIs18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(18);
        assertEquals("Ожидается true для возраста 18 лет (граничный случай)",
                    true, isAdult);
    }
}

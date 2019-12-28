import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class FizzBuzzTest {

    private int number;
    private String expectedResult;

    public FizzBuzzTest(int number, String expectedResult) {
        this.number = number;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, "1"},
                {3, "Fizz"}
        });
    }

    @Test
    public void test() {
        assertThat(FizzBuzz.of(number)).isEqualTo(expectedResult);
    }
}
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
@Category(CategoriesExample.class)
@RunWith(value = Parameterized.class)
public class CalcucaltorTest {
    public int numberOne;
    public int numberTwo;
    public int expected;

    public CalcucaltorTest(int numberOne, int numberTwo, int expected) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.expected = expected;
    }

    @Parameters(name = "{index}: testAdd({0}+{1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 2, 4},
                {8, 2, 10},
                {4, 5, 9},
                {5, 5, 10}
        });
    }

    @Test
    public void test_addTwoNumbes() {
        assertThat(Calcucaltor.resultOfSum(numberOne, numberTwo), is(expected));
        System.out.println("Test is passed");
    }


}
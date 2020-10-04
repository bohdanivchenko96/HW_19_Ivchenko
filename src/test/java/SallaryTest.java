import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.containsString;


public class SallaryTest {
    Sallary sallary = new Sallary();
    @Category(CategoriesExample.class)
    @Test
    public void testSallaryForYear2() {
        assertEquals(12000, sallary.sallaryForYear2(1000));
    }

    @Test
    public void testSallaryForYear1() {
        assertNull(sallary.sallaryForYear1(-5));
    }
    @Category(CategoriesExample.class)
    @Test
    public void test() {
        assertThat(String.valueOf(sallary.sallaryForYear1(500)), containsString("0"));
    }


}

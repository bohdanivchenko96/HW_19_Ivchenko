import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class PersonTest {
    public Person person = new Person();


    @Test
    @Before
    public void test1PersonAgeVerification() {
        assertTrue(String.valueOf(person.personAgeVerification(18)), true);
        assertTrue(String.valueOf(person.personAgeVerification(125)), true);
        assertFalse(String.valueOf(person.personAgeVerification(17)), false);
        assertFalse(String.valueOf(person.personAgeVerification(-18)), false);
    }

    @Test(timeout = 100)
    public void test1ThreePersonsAverageAge() {
        assertNotNull(person.threePeronsAverageAge(21, 32, 78));
    }

    @Test
    @After
    public void test2ThreePersonsAverageAge() {

        assertEquals(43.66, person.threePeronsAverageAge(21, 32, 78), 0.01);
    }
    @Category(CategoriesExample.class)
    @Test(expected = Exception.class)
    public void testNameToUpperCase() {
        assertNull(person.nameToUpperCase(null));
    }
    @Category(CategoriesExample.class)
    @Test
    public void testMultiplyAge1() {
        assertSame(25, person.ageMultiplyByFive(5));
    }

}

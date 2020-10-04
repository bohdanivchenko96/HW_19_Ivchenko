
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(CategoriesExample.class)
//Include multiple categories//@Categories.IncludeCategory({PerformanceTests.class, RegressionTests.class})
@Suite.SuiteClasses({PersonTest.class, SallaryTest.class, CalcucaltorTest.class})
public class TestSuite {

}

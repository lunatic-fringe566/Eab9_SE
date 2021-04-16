package JUnitPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestaddNumbers.class, TestaddStrings.class})
public class AllTests {

}

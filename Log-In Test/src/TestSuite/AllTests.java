package TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Test1BisLogIn.class, Test2BisNegativeLogIn.class, Test3BisLogInLogOut.class, Test4BisLogIn.class,
		Test5BisNegativeLogInSameUserName.class })

public class AllTests {

}

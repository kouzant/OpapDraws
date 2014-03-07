package gr.kzps;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * One test suite to rule them all.
 * @author Antonis Kouzoupis
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ QueryServiceByDateTest.class, QueryServiceLatestTest.class,
		QueryServiceDrawNumTest.class })
public class QueryServiceTest {

}

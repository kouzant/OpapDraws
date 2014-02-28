package gr.kzps;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ QueryServiceByDateTest.class, QueryServiceLatestTest.class })
public class QueryServiceTest {

}

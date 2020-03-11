import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ SinTest.class, CosTest.class, TanTest.class })
public class TrigonometryTest {

	@Test
	void test() {

		//Getting results from all test classes
		Result result = JUnitCore.runClasses(TrigonometryTest.class);
		// looping through failures in each results
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}


	}

}

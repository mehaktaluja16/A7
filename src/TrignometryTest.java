import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ SinTest.class, CosTest.class, TanTest.class })
public class TrignometryTest {

	@Test
	void test() {

		Result result = JUnitCore.runClasses(TrignometryTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		//System.out.println(result.wasSuccessful());

	}

}

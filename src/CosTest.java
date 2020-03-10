import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class CosTest {

	double input, expected;

	public CosTest(double input, double expected) {
		this.input = input;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, Math.cos(Math.toRadians(0)) },
				{ 3.14 / 2, Math.cos(Math.toRadians(3.14 / 2)) }, { -1, Math.cos(Math.toRadians(-1)) },
				{ 3.14, Math.cos(Math.toRadians(3.14)) } });
	}

	@Test
	public void cosTest() {
		double a = input;
		double b = Trignometry.toRadian(a);
		assertEquals(expected, Trignometry.cos(b), 0.01);
	}

}

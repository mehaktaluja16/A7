import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class TanTest {

	double input, expected;

	public TanTest(double input, double expected) {
		this.input = input;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(
				new Object[][] { { 0, Math.tan(Math.toRadians(0)) }, { 3.14 / 2, Math.tan(Math.toRadians(3.14 / 2)) },
						{ -1, Math.tan(Math.toRadians(-1)) }, { 3.14, Math.tan(Math.toRadians(3.14)) } });
	}

	@Test
	public void tanTest() {
		double a = input;
		double b = Trigonometry.toRadian(a);
		assertEquals(expected, Trigonometry.tan(b), 0.01);
	}

}

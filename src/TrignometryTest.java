import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class TrignometryTest {

	double input, expected;

	public TrignometryTest(double input, double expected) {
		this.input = input;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, Math.sin(Math.toRadians(0)) },
				{ 3.14 / 2, Math.sin(Math.toRadians(3.14 / 2)) }, { -1, Math.sin(Math.toRadians(-1)) },
				{ 3.14, Math.sin(Math.toRadians(3.14)) } });
	}

	@Test
	public void sinTest() {
		double a = input;
		double b = Trignometry.toRadian(a);
		assertEquals(expected, Trignometry.sin(b), 0.01);
	}

}

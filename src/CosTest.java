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
				{ 3.14, Math.cos(Math.toRadians(3.14)) }, { 21474, Math.cos(Math.toRadians(21474)) },
				{ 2147483647, Math.cos(Math.toRadians(2147483647)) },
				{ -2147483647, Math.cos(Math.toRadians(-2147483647)) }, { 45, Math.cos(Math.toRadians(45)) },
				{ 90, Math.cos(Math.toRadians(90)) }, { 135, Math.cos(Math.toRadians(135)) },
				{ 180, Math.cos(Math.toRadians(180)) }, { 225, Math.cos(Math.toRadians(225)) },
				{ 270, Math.cos(Math.toRadians(270)) }, { 360, Math.cos(Math.toRadians(360)) },
				{ -45, Math.cos(Math.toRadians(-45)) }, { -90, Math.cos(Math.toRadians(-90)) },
				{ -135, Math.cos(Math.toRadians(-135)) }, { -180, Math.cos(Math.toRadians(-180)) },
				{ -225, Math.cos(Math.toRadians(-225)) }, { -270, Math.cos(Math.toRadians(-270)) },
				{ -360, Math.cos(Math.toRadians(-360)) }, { 0.1, Math.cos(Math.toRadians(0.1)) },
				{ -0.1, Math.cos(Math.toRadians(-0.1)) } });
	}

	@Test
	public void cosTest() {
		double a = input;
		double b = Trigonometry.toRadian(a);
		assertEquals(expected, Trigonometry.cos(b), 0.01);
	}

}

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
		return Arrays.asList(new Object[][] { 
			{ 0, Math.tan(Math.toRadians(0)) },
				{ 3.14 / 2, Math.tan(Math.toRadians(3.14 / 2)) },
				{ -1, Math.tan(Math.toRadians(-1)) },
				{ 3.14, Math.tan(Math.toRadians(3.14)) },
				{ 21474, Math.tan(Math.toRadians(21474)) },
				{ 2147483647, Math.tan(Math.toRadians(2147483647)) },
				{ -2147483647, Math.tan(Math.toRadians(-2147483647)) },
				{ 45, Math.tan(Math.toRadians(45)) },
				{ 135, Math.tan(Math.toRadians(135)) },
				{ 180, Math.tan(Math.toRadians(180)) }, 
				{ 225, Math.tan(Math.toRadians(225)) },
				{ 360, Math.tan(Math.toRadians(360)) },
				{ -45, Math.tan(Math.toRadians(-45)) }, 
				{ -135, Math.tan(Math.toRadians(-135)) },
				{ -180, Math.tan(Math.toRadians(-180)) },
				{ -225, Math.tan(Math.toRadians(-225)) },
				{ -0.1, Math.tan(Math.toRadians(-360)) }, 
				{ 0.1, Math.tan(Math.toRadians(0.1)) } });
	}

	@Test
	public void tanTest() {
		
		double a = input;
		double b = Trigonometry.toRadian(a);
		assertEquals(expected, Trigonometry.tan(b),0.01);
	
	}

}

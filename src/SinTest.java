import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class SinTest {

	double input, expected;

	public SinTest(double input, double expected) {
		this.input = input;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, Math.sin(Math.toRadians(0)) },
				{ 3.14 / 2, Math.sin(Math.toRadians(3.14 / 2)) }, { -1, Math.sin(Math.toRadians(-1)) },
				{ 3.14, Math.sin(Math.toRadians(3.14)) }, { 21474, Math.sin(Math.toRadians(21474)) },
				{ 2147483647, Math.sin(Math.toRadians(2147483647)) },
				{ -2147483647, Math.sin(Math.toRadians(-2147483647)) }, { 45, Math.sin(Math.toRadians(45)) },
				{ 90, Math.sin(Math.toRadians(90)) }, { 135, Math.sin(Math.toRadians(135)) },
				{ 180, Math.sin(Math.toRadians(180)) }, { 225, Math.sin(Math.toRadians(225)) },
				{ 270, Math.sin(Math.toRadians(270)) }, { 360, Math.sin(Math.toRadians(360)) },
				{ -45, Math.sin(Math.toRadians(-45)) }, { -90, Math.sin(Math.toRadians(-90)) },
				{ -135, Math.sin(Math.toRadians(-135)) }, { -180, Math.sin(Math.toRadians(-180)) },
				{ -225, Math.sin(Math.toRadians(-225)) }, { -270, Math.sin(Math.toRadians(-270)) },
				{ -0.1, Math.sin(Math.toRadians(-0.1)) }, { 0.1, Math.sin(Math.toRadians(0.1)) } });
	}

	@Test
	public void sinTest() {

		// 90 = 1.5707963267948966
		//System.out.println(Math.sin(Math.toRadians(270))+" "+Trigonometry.sin(Trigonometry.toRadian(270)));

		
		  double a = input; double b = Trigonometry.toRadian(a); assertEquals(expected,
		  Trigonometry.sin(b), 0.01);
		 
	}

}

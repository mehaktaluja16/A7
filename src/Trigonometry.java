import java.math.BigInteger;

public class Trigonometry {

	/**
	 * @author Group 22 (Jobanpreet Singh, Lovejot Singh, Guntas Kaur, Mehak Taluja)
	 * @version 1.0
	 * 
	 *          This class calculate the value of sine, cosine and tan from radian
	 *          values entered as an input
	 * 
	 */

	/**
	 * 
	 * @param x Radian value
	 * @return sine value of input x
	 */

	public static double sin(double x) {

		final double PI = 3.141592653589793;

		// convert x to an angle between -2 PI and 2 PI
		x = x % (2 * PI);

		// compute the Taylor series approximation
		double term = 1.0;
		double result = 0.0;
		result = x;
		for (int i = 1; term != 0.0; i++) {
			term *= (x / i);
			if (Double.isFinite(fact(i * 2 + 1).doubleValue()))
				result += pow(-1, i) * pow(x, i * 2 + 1) / fact(i * 2 + 1).doubleValue();
		}

		return result;

	}

	/**
	 * 
	 * @param x Radian value
	 * @return cosine value of input x
	 */
	static double cos(double x) {

		return -1;

	}

	/**
	 * 
	 * @param x Radian value
	 * @return tan value of input x
	 */
	static double tan(double x) {

		return -1;

	}

	public static void main() {
	}

	/**
	 * 
	 * @param x base value
	 * @param p power value
	 * @return x^p
	 */
	static double pow(double x, int p) {
		double result = 1;

		for (double i = 1; i <= p; i++) {
			result = result * x;
		}

		return result;
	}

	/**
	 * 
	 * @param x value to calculate factorial of
	 * @return return factorial value
	 */

	public static BigInteger fact(int f) {
		if (f < 0) {
			return BigInteger.ZERO;
		} else if (f == 0) {
			return BigInteger.ONE;
		} else {
			return BigInteger.valueOf(f).multiply(fact(f - 1));
		}
	}

	/**
	 * 
	 * @param x value in degree
	 * @return converted radian value of x
	 */
	static double toRadian(double x) {
		return x * 0.017453292519943295;
	}

}

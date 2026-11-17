package recursion;

public class Recursion {

	public static int sumOfDigits(int n) {
		String absS;
		int temp;
		int abs;
		
		abs = Math.abs(n);
		absS = "" + abs;
		if (absS.length() > 1)
		{
			temp = Integer.valueOf(absS.substring(0,1));
			return temp + sumOfDigits(Integer.valueOf(absS.substring(1,absS.length())));
		}
		else
		{
			return Integer.valueOf(absS);
		}
		
		
		
		
		

	}

	public static String toUpper(String str) {
		String temp;
		String end;

		if (str.length() > 1) {
			temp = str.substring(0, 1).toUpperCase();
			end = temp.toUpperCase() + " " + toUpper(str.substring(1, str.length()));
			return end;
		} else {
			return str.toUpperCase();
		}
	}

	public static double harmonic(int n) {
		if (n == 0)
			throw new IllegalArgumentException("The argument n can't be zero.");

		if (n == 1)
			return 1;
		else if (n < 0)
			return -1 * harmonic(-n);
		else // n > 1
			return 1.0 / n + harmonic(n - 1);
	}

}

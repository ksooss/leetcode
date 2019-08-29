package leetcode;

public class Reverse {

	public static void main(String[] args) {
		int x = -123;
		int result = reverse(x);
		System.out.println("result : " + result);
	}

	public static int reverse(int x) {
		try {
			boolean negFlag = x < 0 ? true : false;
			if (negFlag)
				x = Math.multiplyExact(x, -1);

			int result = 0;

			while (x != 0) {
				result = Math.multiplyExact(result, 10);
				result = Math.addExact(result, x % 10);
				x /= 10;
			}
			if (negFlag)
				result = Math.multiplyExact(result, -1);

			return result;
		} catch (ArithmeticException e) {
			return 0;
		}
	}
}

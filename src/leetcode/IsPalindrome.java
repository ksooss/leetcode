package leetcode;

public class IsPalindrome {

	public static void main(String[] args) {
		int x = 121;
		boolean result = isPalindrome(x);
		if (result)
			System.out.println("true");
		else
			System.out.println("false");
	}

	public static boolean isPalindrome(int x) {
		boolean result = false;
		int origin = x;
		if (x >= 0) {
			int y = 0;
			while (x != 0) {
				y = y * 10 + x % 10;
				x /= 10;
			}
			if (origin == y)
				result = true;
		}

		return result;
	}
}

package problem;

public class IsPalindrome {

	public static void main(String[] args) {
		int x = 121;
		
		IsPalindrome obj = new IsPalindrome();
		boolean result = obj.isPalindrome(x);
		if (result)
			System.out.println("result is true");
		else
			System.out.println("result is false");
	}

	public boolean isPalindrome(int x) {
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

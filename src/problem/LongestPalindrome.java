package problem;

public class LongestPalindrome {

	public static void main(String[] args) {
		String s = "bababaab";

		LongestPalindrome obj = new LongestPalindrome();
		String result = obj.longestPalindrome(s);
		System.out.println("result : " + result);
	}

	public String longestPalindrome(String s) {
		if (s == null || s.length() == 0)
			return "";
		if (s.length() == 1)
			return s;

		char[] cArr = s.toCharArray();
		int start = 0;
		int end = 0;
		int maxLength = 1;
		int tempLength = 0;
		for (int i = 0; i < cArr.length; i++) {
			int j = i - 1;
			int k = i;
			while (k < cArr.length && cArr[i] == cArr[k])
				k++;
			while (j > -1 && k < cArr.length && cArr[j] == cArr[k]) {
				j--;
				k++;
			}
			tempLength = k - j - 1;
			if (tempLength > maxLength) {
				maxLength = tempLength;
				start = j + 1;
				end = k - 1;
			}
		}
		return s.substring(start, end + 1);
	}
}

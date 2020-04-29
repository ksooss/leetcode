package leetcode;

public class MyAtoi {

	public static void main(String[] args) {
		String str = "world    -42";
		
		MyAtoi obj = new MyAtoi();
		int result = obj.myAtoi(str);
		System.out.println("result : " + result);
	}

	public int myAtoi(String str) {
		boolean negFlag = false;
		int result = 0;
		str = str.trim();
		try {
			for (int i = 0; i < str.length(); i++) {
				char s = str.charAt(i);
				if (!(s == '+' || s == '-' || (s >= '0' && s <= '9')))
					break;
				else if (i > 0 && !(s >= '0' && s <= '9'))
					break;
				else if (s == '-')
					negFlag = true;
				else if (s >= '0' && s <= '9') {
					int num = s - '0';
					result = Math.multiplyExact(result, 10);
					result = Math.addExact(result, num);
				}
			}
			if (negFlag)
				result = Math.multiplyExact(result, -1);
		} catch (ArithmeticException e) {
			if (negFlag)
				return Integer.MIN_VALUE;
			else
				return Integer.MAX_VALUE;
		}

		return result;
	}
}
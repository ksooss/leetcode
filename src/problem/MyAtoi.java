package problem;

public class MyAtoi {

	public static void main(String[] args) {
		String str = "world    -42";
		
		MyAtoi obj = new MyAtoi();
		int result = obj.myAtoi(str);
		System.out.println("result : " + result);
	}

	public int myAtoi(String s) {
		boolean negFlag = false;
		int result = 0;
		s = s.trim();
		try {
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (!(c == '+' || c == '-' || (c >= '0' && c <= '9')))
					break;
				else if (i > 0 && !(c >= '0' && c <= '9'))
					break;
				else if (c == '-')
					negFlag = true;
				else if (c >= '0' && c <= '9') {
					int num = c - '0';
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
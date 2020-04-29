package leetcode;

public class Convert {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int numRows = 4;
		
		Convert obj = new Convert();
		String result = obj.convert(s, numRows);
		System.out.println("result : " + result);
	}

	public String convert(String s, int numRows) {
		if (numRows >= s.length() || numRows == 1) {
			return s;
		} else {
			int num = numRows * 2 - 2;
			int length = s.length();

			Object[] sbList = new Object[numRows];
			for (int i = 0; i < numRows; i++) {
				sbList[i] = new StringBuilder();
			}
			for (int i = 0; i < length; i++) {
				int remainder = i % num;

				if (remainder >= numRows) {
					remainder = num - remainder;
				}

				((StringBuilder) sbList[remainder]).append(s.charAt(i));
			}
			StringBuilder result = new StringBuilder();
			for (int j = 0; j < numRows; j++)
				result.append(sbList[j]);
			return result.toString();
		}
	}

}

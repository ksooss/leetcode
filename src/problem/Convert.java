package problem;

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
			StringBuffer result = new StringBuffer();
			int interval = numRows * 2 - 2;
			int length = s.length();
			for (int i = 0; i < numRows; i++) {
				for (int j = i; j < length; j+=interval) {
					result.append(s.charAt(j));
					
					if(i==0 || i==numRows-1)
						continue;
					int idx = j+interval - 2*i;
					if(idx<length) {
						result.append(s.charAt(idx));
					}
				}
			}
			return result.toString();
		}
	}

}

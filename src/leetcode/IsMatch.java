package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsMatch {

	public static void main(String[] args) {
		String s = "aa";
		String p = "a";
		
		IsMatch obj = new IsMatch();
		boolean result = obj.isMatch(s, p);
		if(result)
			System.out.println("result is true");
		else
			System.out.println("result is false");
	}
	
	public boolean isMatch(String s, String p) {
		Pattern pattern = Pattern.compile(p);
		Matcher matcher = pattern.matcher(s);
		
		if(matcher.find())
			return true;
		else
			return false;
    }
}

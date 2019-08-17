package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		String s = "abba";
		int result = lengthOfLongestSubstring(s);
		System.out.println("result : " + result);
	}

	public static int lengthOfLongestSubstring(String s) {
		int length = s.length();
		char charList[] = s.toCharArray();
		int start = 0;
		int result = 0;
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (int i = 0; i < length; i++) {
			if (charMap.get(charList[i]) != null && charMap.get(charList[i]) >= start) {
				start = charMap.get(charList[i]) + 1;
			}
			charMap.put(charList[i], i);
			result = Math.max(result, i-start+1);
		}
		return result;
	}
}

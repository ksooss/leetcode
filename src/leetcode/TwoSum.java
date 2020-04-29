package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		
		TwoSum obj = new TwoSum();
		int[] result = obj.twoSum(nums, 9);
		for (int num : result) {
			System.out.println("result : " + num);
		}
	}

	public int[] twoSum(int[] nums, int target) {
		int length = nums.length;

		if (nums == null || length <= 1) {
			return null;
		}

		Map<Integer, Integer> map = new HashMap<>(length);
		for (int i = 0; i < length; i++) {
			int rest = target - nums[i];
			if (map.get(rest) != null) {
				return new int[] { map.get(rest), i };
			} else {
				map.put(nums[i], i);
			}
		}

		return null;
	}
}

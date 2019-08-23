package leetcode;

import java.util.Arrays;

public class FindMedianSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = {};
		int[] nums2 = { 2, 3 };
		double result = findMedianSortedArrays(nums1, nums2);
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int sumOfLength = nums1.length + nums2.length;
		int[] nums3 = new int[sumOfLength];

		int idx1 = 0;
		int idx2 = 0;
		int idx3 = 0;
//		for (; idx1 < nums1.length && idx2 < nums2.length; idx3++) {
//			if (nums1[idx1] < nums2[idx2])
//				nums3[idx3] = nums1[idx1++];
//			else
//				nums3[idx3] = nums2[idx2++];
//		}
//		for (; idx1 < nums1.length; idx1++)
//			nums3[idx3++] = nums1[idx1];
//
//		for (; idx2 < nums2.length; idx2++)
//			nums3[idx3++] = nums2[idx2];

		while (idx1 <= nums1.length - 1 || idx2 <= nums2.length - 1) {
			if (idx1 == nums1.length)
				nums3[idx3++] = nums2[idx2++];
			else if (idx2 == nums2.length)
				nums3[idx3++] = nums1[idx1++];
			else if (nums1[idx1] < nums2[idx2])
				nums3[idx3++] = nums1[idx1++];
			else
				nums3[idx3++] = nums2[idx2++];
		}

		if (sumOfLength % 2 != 0)
			return nums3[sumOfLength / 2];
		else
			return ((double) nums3[sumOfLength / 2] + nums3[sumOfLength / 2 - 1]) / 2;
	}
}

package problem;

public class FindMedianSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = {1, 3};
		int[] nums2 = { 2 };
		
		FindMedianSortedArrays obj = new FindMedianSortedArrays();
		double result = obj.findMedianSortedArrays(nums1, nums2);
		System.out.println("result : " + result);
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int len1 = nums1.length;
		int len2 = nums2.length;
		int i1 = 0;
		int i2 = 0;
		int[] arr = new int[len1+len2];
		for(int i = 0; i < len1+len2; i++) {
			if (i2==len2)
				arr[i] = nums1[i1++];
			else if(i1==len1)
				arr[i] = nums2[i2++];
			else if(nums1[i1]<=nums2[i2])
				arr[i] = nums1[i1++];
			else
				arr[i] = nums2[i2++];
		}
		int len3 = arr.length;
		if(len3%2==1)
			return arr[len3/2];
		else
			return ((double)arr[len3/2-1]+arr[len3/2])/2;
	}
	
	public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
		int sumOfLength = nums1.length + nums2.length;
		int[] nums3 = new int[sumOfLength];

		int idx1 = 0;
		int idx2 = 0;
		int idx3 = 0;

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

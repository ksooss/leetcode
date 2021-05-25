package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		ThreeSum obj = new ThreeSum();
		List<List<Integer>> result = obj.threeSum(nums);
		for (List<Integer> list : result) {
			System.out.println("result : ");
			for(int i = 0; i<list.size(); i++)
				System.out.println(list.get(i));
		}
	}
	
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		List<Integer> arr = Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new));
		arr.sort(null);
		
		for(int i = 0; i<arr.size()-2; i++) {
			for(int j = i+1; j<arr.size()-1; j++) {
				for(int k = j+1; k<arr.size(); k++) {
					if(arr.get(i)+arr.get(j)+arr.get(k)==0) {
						List<Integer> temp = new ArrayList<Integer>();
						temp.add(arr.get(i));
						temp.add(arr.get(j));
						temp.add(arr.get(k));
						if(!result.contains(temp))
							result.add(temp);
					}
				}
			}
		}
		
        return result;
    }

}
package p09;

import java.util.ArrayList;
import java.util.List;

public class SortTest2 {

	public static void main(String[] args) {

		int[] nums = new int[] { 10, 18, 35, 17, 4 };

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
	}
}

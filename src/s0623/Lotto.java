package s0623;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		int[] nums = new int[6];
		Random r = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(6) + 1;
			for (int j = i - 1; j >= 0; j--) {
				if (nums[j] == nums[i]) {
					i--;
				}
			}
		}
		for(int num:nums) {
			System.out.println(num);
		}
	}
}

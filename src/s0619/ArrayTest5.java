package s0619;

public class ArrayTest5 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		int[] tmpNums = nums;
		nums = new int[6];
		for(int i=0;i<nums.length;i++) {
			for(int j=1;j<tmpNums.length;j++) {
				nums[i] = (i+1)*3;
				tmpNums[j] = j;
			}
			System.out.println(nums[i]);
		}
	}
}

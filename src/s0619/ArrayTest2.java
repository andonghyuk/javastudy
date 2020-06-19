package s0619;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
			System.out.println("num[" + i + "] =" + nums[i]);
		}
	}
}

package s0624;

public class StringArray3 {
	
	public static void main(String[] args) {
		String str = "21,53,1,6,86,43,124,67,21,643";
		String[] strs = str.split(",");
		int[] nums = new int[strs.length];
		
		for(int i = 0;i < strs.length; i++) {
			nums[i] = Integer.parseInt(strs[i]);
			if((nums[i]+1)%2 == 0) {
				nums[i] = 0;				
				
			}

		}
		
		for(int num:nums) {
			System.out.println(num);
		}
	}
}

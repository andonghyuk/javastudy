package s0624;

public class StringArray {
	public static void main(String[] args) {

		
		String lottoNums = "10,21,5,19,41,17,";
		
		int[] nums = new int[6];
		int cnt = 0;
		
		while(lottoNums.indexOf(",")!=-1) {
		
			int idx = lottoNums.indexOf(",");
			String num1 = lottoNums.substring(0,idx);
			nums[cnt++] = Integer.parseInt(num1);
			lottoNums = lottoNums.substring(idx + 1);
					
		}
		if(!"".equals(lottoNums)) {
			nums[cnt] = Integer.parseInt(lottoNums);
		}
		
		for(int num:nums) {
			System.out.println(num);
		}
		
		
	/*String lottoNums = "10,21,5,19,41,17";
		
		int idx = lottoNums.indexOf(",");
		String num1 = lottoNums.substring(0,idx);
		lottoNums = lottoNums.substring(idx + 1);
		System.out.println(lottoNums);
		
		idx = lottoNums.indexOf(",");
		String num2 = lottoNums.substring(0, idx);
		lottoNums = lottoNums.substring(idx + 1);
		System.out.println(lottoNums);
	}*/
	}
		
}

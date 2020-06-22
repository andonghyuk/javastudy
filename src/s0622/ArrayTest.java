package s0622;

public class ArrayTest {
	public static void main(String[] args) {
		int[][] nums = new int[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				nums[i][j] = (i*3)+1+j; 
			}
		}
		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				nums[i][j] = num++;
//			}
//		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				System.out.println("nums [" + i + "][" + j + "]=" + nums[i][j]);
//				System.out.printf("nums [%d][%d]=%d\n\r",i,j,nums[i][j]);
			}
		}

	}
}

package s0619;

public class ArrayTest {

	String[] strs;

	public static void main(String[] args) {
		ArrayTest at = new ArrayTest();
		
		at.strs = new String[3];
		at.strs[0] = "엽떡";
		
		at.strs = new String[4];
		System.out.println(at.strs[0]);
		
	}

//	public static void main(String[] args) {
//		int num1 = 1;
//		int num2 = 5;
//		
//		int tmp = num1;
//		num1 = num2;
//		num2 = tmp;
//		
//		System.out.println(num1);
//		System.out.println(num2);
//	}

}

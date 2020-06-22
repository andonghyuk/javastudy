package s0622;

public class IfTest {
	public static void main(String[] args) {
//		int num1 = 1;
//		int num2 = 10;
//		int num3 = 20;
//
//		if (num1 > 1 && num2 < 20 && num3 == 21) {
//			System.out.println("tt");
//		}
		System.out.println("시작");
		for (int i = 1; i <= 100; i++) {
			
			double d = Math.random();
			int num = (int) (d * 20) + 1;
			if (num < 1 || num > 20) {
				System.out.println(num + ": ?");
			}
		}
		System.out.println("종료");

	}
}

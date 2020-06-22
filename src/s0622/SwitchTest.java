package s0622;

import java.util.Random;

public class SwitchTest {
	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(10) + 1;
		System.out.println(num);
		switch (num) {
			case 1:
				System.out.println("아 1이구나");
				break;
			case 2:
				System.out.println("아 2구나");
				break;
			default :
				System.out.println("1도 2도 아니구나");
		}

	}
}

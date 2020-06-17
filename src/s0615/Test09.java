package s0615;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("너 몇살이니? : ");
		
		String age = s.nextLine();
		System.out.println("야 너" + age + "살아있구나");
	}

}

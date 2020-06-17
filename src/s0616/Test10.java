package s0616;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("어디살아?");
		String address = scan.nextLine(); 
		//System.out.println("서울"=="서울");
		if(address.equals("서울")) {
			System.out.println("수도권");
		}else if(address.equals("남양주")) {
			System.out.println("해외");
		}else {
			System.out.println("지방");
		}
	}

}

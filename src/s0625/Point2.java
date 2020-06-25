package s0625;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Point2 {
	public static void main(String[] args) {
		int maxNum = 0;
		int minNum = 0;
		int min = -1;
		int max = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("학생 몇명 ? : ");
		int cnt = Integer.parseInt(scan.nextLine());
		List<Integer> intList = new ArrayList<>();

		for(int i=0;i<cnt;i++) {
			System.out.println(i + "번째 학생 점수는? : " );
			intList.add(Integer.parseInt(scan.nextLine()));
			if(i==0||maxNum<intList.get(i)) {
				maxNum = intList.get(i);
				
			}
			if(i==0||minNum>intList.get(i)) {
				minNum = intList.get(i);
				
			}
		}
		System.out.println("높은 점수 : " + maxNum);
		System.out.println("낮은 점수 : " + minNum);
		
//		for(int i=0;i<cnt;i++) {
//			System.out.println(i + "번째 학생 점수는? : " );
//			intList.add(Integer.parseInt(scan.nextLine()));
//		}
//		System.out.println(intList);
//		
//		for(int i = 0;i>intList.size();i++) {
//			maxNum = intList.get(i);
//			max = i;
//		}
//		System.out.println("제일 높은 점수 : " + max);
//		
//		for(int i = 0;i<intList.size();i++) {
//			minNum = intList.get(i);
//			min = i;
//		}
//		System.out.println("제일 낮은 점수 : " + min);
		
//		System.out.println(intList);
		
	}
}
 
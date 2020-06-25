package s0625;

import java.util.ArrayList;
import java.util.List;

public class MinNum {
	public static void main(String[] args) {
		int minNum = 0;
		int idx = -1;
		
		List<Integer> numList = new ArrayList<>();
		numList.add(120);
		numList.add(220);
		numList.add(1200);
		numList.add(720);
		numList.add(125);

//		for (int i = 0; i < numList.size(); i++) {
//			minNum = numList.get(i);
//			idx = i;
//		}
//		System.out.println(idx + "번째 점수가 제일 낮은 점수 :" + minNum);
		
		int min = 100;
		for(int i=0;i<numList.size();i++) {
			if(i==0 || min>numList.get(i)) {
				min = numList.get(i);
			}
		}
		System.out.println("제일 낮은 점수 :" + min);
	}
}

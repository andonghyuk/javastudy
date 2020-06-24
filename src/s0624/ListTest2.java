package s0624;

import java.util.ArrayList; //배열 리스트
import java.util.List;

public class ListTest2 {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("선생님 천재");
		strList.add("너 나와");
		strList.add("하하하~");
		
		int idx = strList.indexOf("너나와");
		System.out.println(idx);
	}
}

package s0625;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Point3 {
	public static void main(String[] main) {

		String maxName = "";
		String minName = "";

		int max = 0;
		int min = 0;

		List<Student> stList = new ArrayList<>();

		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			Student s = new Student();
			s.setName("이름" + i);
			s.setPoint(r.nextInt(101));
			stList.add(s);
		}
		for (int i = 0; i < stList.size(); i++) {
			Student st = stList.get(i);
			if (i == 0) {
				min = st.getPoint();
				max = st.getPoint();
				minName = st.getName();
				maxName = st.getName();
			}
			if (min > st.getPoint()) {
				min = st.getPoint();
				minName = st.getName();
			}
			if (max < st.getPoint()) {
				max = st.getPoint();
				maxName = st.getName();
			}

		}
		System.out.println("" + max + "" + maxName);
		System.out.println("" + min + "" + minName);

		System.out.println(stList);
	}
}

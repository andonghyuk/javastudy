package s0625;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Point4 {
	public static void main(String[] main) {

		Student maxStudent = null;
		Student minStudent = null;

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
			if (i == 0 || minStudent.getPoint()>st.getPoint()) {
				minStudent = st;
			}
			if (i == 0 || maxStudent.getPoint()<st.getPoint()) {
				maxStudent = st;
			}

		}
		System.out.println("1등" + maxStudent);
		System.out.println("꼴등" + minStudent);
//	instanceof
	}
}

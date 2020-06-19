package s0619;

import s0619.sub.SubTest;

public class AccessTest {
	public static void main(String[] args) {
		SubTest st = new SubTest();
		st.num1 = 10;
		st.num2 = 10;
		st.num3 = 11;
		st.num4 = 10;
	} // 패키지가 다르면 public 외 모든 것들을 사용할 수 없음.
}

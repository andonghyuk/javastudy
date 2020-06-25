package s0618;

public class Son extends Father {

	int money = 1000;
	
	public static void main(String[] args) {
		Son s = new Son();
		s.name = "손흥민";
		System.out.println(s.name + "이 가진 돈은" + s.money + "원 입니다.");

		Father f = new Son();
		Son s2 = (Son) f;
		System.out.println("아빠가 가진 돈은" + s2.money);
	}
}

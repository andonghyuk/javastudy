package s0625;

class Test {
	public void run() {
		System.out.println("달리기~~~");
	}
}

class SubTest extends Test{
	public void run() {
		super.run();
		System.out.println("힘들어 걷자~");
	}
	public void feed() {
		System.out.println("밥주다");
	}
}

public class OverRideTest {
	public static void main(String[] args) {
//		Test t = new SubTest();
//		t.run();
		
		Test st = new SubTest();
		st.run();
		
	}
}

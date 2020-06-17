package s0617;

public class MethodTest2 {
	
	static int add(){
		return add(0);
	}
	
	static int add(int num1) {
		return add(num1,0);
	}
	
	static int add(int num1, int num2) {
		return num1+num2;
	}
	
	public static void main(String[] args) {
		System.out.println(add());
	}
	
}

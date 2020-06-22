package s0622;

public class LoopTest {
	public static void main(String[] args) {

//		int r = 0;
//
//		for (int i = 1; i <= 1000; i++) {
//			r += i;
//		}
//		System.out.println(r);
		
		int n1 = 0;
		int n2 = 0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				n1 += i;
			}else {
				n2 += i;
			}

		}			System.out.println("짝수의 값 : " + n1);
		System.out.println("홀수의 값 : " + n2);
		System.out.println("전체수의 값 : " + (n1+n2));
		
	}
}

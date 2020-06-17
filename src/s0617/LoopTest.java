package s0617;

public class LoopTest {
	public static void main(String[] args) {
		/*for(int i=1;i<10;i++) { //(선언부;조건부;증감부)
			System.out.println("난 멈추지 않지!");
		}*/
		
		for(int i=1;i<10;i++) {
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
}

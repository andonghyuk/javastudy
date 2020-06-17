package s0617;

public class StringTest {
		
		static int length(String str) {
			int cnt = 0;
			for(int i=0;i<str.length();i++) {
				System.out.print(str.charAt(i));
				cnt++;
			}
			return cnt;
			
		}
	
	public static void main(String[] args) {
		String str = "123452";
		int cnt = length(str);
		System.out.println("str의 글자수 : " + cnt);
		
		/*String str = "12345";
		System.out.println(str.length());
		System.out.println(str.indexOf("2"));		
		System.out.println(str.replace("23", "이삼"));*/
		
		
		
	}
}

package s0619;

public class GuGuDan {
	public static void main(String[] args) {
//		for(int i=1;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.println(i + "X" + j + "=" + i*j);
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= 100; i++) {
//			System.out.print(i);
//			if (i % 10 == 0) {
//				System.out.println();
//			}else {
//				System.out.print(",");
//			}
//
//		}

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print("짝");
			}else {
				System.out.print("홀");
			}
			if (i % 10 == 0) {
				System.out.println();
			}else {
				System.out.print(",");
			}

		}

	}
}

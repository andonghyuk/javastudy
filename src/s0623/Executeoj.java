package s0623;

public class Executeoj {
	public static void main(String[] args) {
		Ojtest[] ojt = new Ojtest[10];

		for (int i = 0; i < ojt.length; i++) {
			ojt[i] = new Ojtest();
			ojt[i].setName("호호호호" + (1 + i) * 2);
			ojt[i].setAge(i);
			ojt[i].setCall(i);
			ojt[i].setAdderss("후후동" + (1 + i) + i * 2);
		}

		for (int i = 0; i < ojt.length; i++) {
			System.out.println(ojt[i]);
		}

	}
}

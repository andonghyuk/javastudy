package homework;

class TeamLeader {
	public void job() {

		System.out.println("일 안하고 뭐하나!?");
	}

	public void talking() {

		System.out.println("하라는건 했나?");
	}
}

class Chief extends TeamLeader {

	public void job() {

		System.out.println("일하고 있는데요;;");
	}

	public void talking() {

		System.out.println("다했습니다!!");
	}
}

public class Homework1 {

	public static void main(String[] args) {

		TeamLeader tl = new TeamLeader();
		tl.job();

		TeamLeader cf = new Chief();
		cf.job();
		cf.talking();

	}

}

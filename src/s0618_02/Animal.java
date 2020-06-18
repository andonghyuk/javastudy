package s0618_02;

public class Animal implements Action {

	@Override
	public void hug() {
		System.out.println("동물이 안겨와요~");
	}

	@Override
	public void cry() {
		System.out.println("동물이 울어요ㅠ");
	}

}

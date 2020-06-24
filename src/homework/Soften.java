package homework;


public class Soften extends Dryer{

	
	public void dryer() {
		System.out.println("작동 전 "+ name + "에 섬유유연제를 넣어주세요");
	}
	
	public static void main(String[] args) {
		Dryer dy = new Dryer();
		Soften sf = new Soften();
		
		dy.dryer();
		sf.dryer();
		
	}
	
}

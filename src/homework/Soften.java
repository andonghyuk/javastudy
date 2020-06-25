package homework;


public class Soften extends Dryer{
	
	
	public void dryer() {
		System.out.println(name + "에는 섬유유연제가 필요해요");
	}
	
	public static void main(String[] args) {
		Dryer dy = new Dryer();
		Soften sf = new Soften();
		
		dy.dryer();
		sf.dryer();
		
	}
	
}

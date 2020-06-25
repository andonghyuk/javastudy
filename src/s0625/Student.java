package s0625;

public class Student {
	
	private int point;
	private String name;
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [point=" + point + ", name=" + name + "]";
	}
	
	
	
}

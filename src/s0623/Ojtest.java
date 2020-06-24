package s0623;

public class Ojtest {
	
	// 접근제어자, 변수 설정
	private String name;
	private int age;
	private int call;
	private String address;
	
	// 투스트링 선언 및 초기화
	public String toString() {
		return "name :" + name + ", age :" + age + ", call :" + call + ", address :" + address;
	}
	
	// 변수 get, set 설정 
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getCall() {
		return call;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	//
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setCall(int call) {
		this.call = call;
	}
	
	public void setAdderss(String address) {
		this.address = address;
	}
	
	
	
	
}

package s0623;

public class Person {
	/*
	 * 이름, 나이, 주소 해당변수의 접근제어자는 private get, set 메소드를 만들기 toString() 메소드를 오버라이딩해서 구현
	 * 위에 있는 모든 정보가 출력되어야 합니다.
	 */

	private String name;
	private int age;
	private String ads;
	
	public String toString () {
		return "name : " + name + ", age : " + age + ", address : " + ads ;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAds() {
		return ads;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAds(String ads) {
		this.ads = ads;
	}

}

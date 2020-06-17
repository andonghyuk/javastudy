package s0616;

public class Person {
	String name;
	String address;
	int age;
	
	void run() {
		System.out.println(name + "가 달립니다.");
		
		if(age>30) {
			System.out.println(age + "가 되니까 지치는구나..");
		}else {
			System.out.println("쌩쌩하구만!!");
		}
	}
	
/*	public static void main(String[] args) {
		Person p = new Person();
		p.name = "투덜이";
		p.age = 32;
		p.run();
	}*/
	
	public static void main(String[] args) {
		Person[] people = new Person[5];
		people[0] = new Person();
		
		
	}
}

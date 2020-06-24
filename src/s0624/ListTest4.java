package s0624;

import java.util.ArrayList;
import java.util.List;

public class ListTest4 {
	public static void main(String[] args) {
		List<Person> pList = new ArrayList<>();
		Person p = new Person();
		pList.add(p);
		System.out.println(pList.get(0));
		
		Person p1 = new Person();
		p1.setName("dndn");
		p1.setAge(12);
		
		Person p2 = p1;
		p1 = new Person();
		p1.setName("aaa");
		
		Person p3 = p2;
		p2 = new Person();
		p2.setName("bbb");
		System.out.println(p3.getName());
		System.out.println(p3.getAge());
		
		
	}
}

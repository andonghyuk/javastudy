package s0624;

import java.util.ArrayList;
import java.util.List;

class Person{
	private String name;
	private int age;
	
	public String toString() {
		return "name : " + name + " age : " + age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
public class ListTest3 {
	public static void main(String[] args) {
		List<Person> pList = new ArrayList<>();
				
		pList.add(new Person());
		pList.add(new Person());
		pList.add(new Person());
		
		pList.get(1).setName("fewkaj");
		pList.get(1).setAge(11);
		System.out.println(pList.get(1));
		
		/*
		 * 1. 1번째 Person 이름과 나이를 바꿔보세요
		 * 1번방에 있는 사람을 끄집어내서 거기에 여러분의 이름과 나이를 입력 및 출력
		 * 
		 * 
		 * 
		 */
	}
}

package homework;

class Animal {
	String name;

	public void jump() {
		System.out.println("동물들이 점프합니다~");
	}
	public void fly() {
		System.out.println("하늘로 날아가요~");
	}
}

class Dog extends Animal {

	public void jump() {
		Animal aniName = new Dog();
		aniName.name = "강아지";
		System.out.println(aniName.name + " 점프점프!");
	}
}

class Cat extends Animal {

	public void jump() {
		Animal aniName = new Cat();
		aniName.name = "고양이";
		System.out.println(aniName.name + " 점프점프!");
	}
}

class Tiger extends Animal {

	public void jump() {
		Animal aniName = new Tiger();
		aniName.name = "호랑이";
		System.out.println(aniName.name + " 점프점프!");
	}
}

class Eagle extends Animal {

	public void fly() {

		System.out.println("푸드드~푸드득~푸드득~~");
	}
}

public class Homework2 {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		dog.jump();
		cat.jump();
		tiger.jump();
		
		Animal eagle = new Eagle();
		eagle.fly();
	}

}

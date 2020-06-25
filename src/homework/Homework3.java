package homework;

class Customer {
	int money = 100000;
	String name;

	public void loan() {
		System.out.println("대출 가능한가요?");
	}
}

class Bank extends Customer {
	int money = 100000000;
	public void loan() {
		System.out.println("고객님~ 고객님의 대출 가능 한도액은 ~ 최대 " + money + "원 입니다.");
	}
}

public class Homework3 {
	public static void main(String[] args) {
		Customer ct = new Customer();
		ct.loan();
		
		Bank bk = new Bank();
		bk.loan();
		
		Customer ctBank = new Bank();
		Bank ctLoan = (Bank) ctBank;
		ctLoan.name = "길동이";
		System.out.println(ctLoan.name + " 고객님의 현재 잔액은 " + (ctLoan.money + ct.money) + "원 입니다.");

	}
}

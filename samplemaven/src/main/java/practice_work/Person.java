package practice_work;

public class Person {
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	public void displayDetails() {
		System.out.println("My name is" +name);
		System.out.println("My age is" + age);
	}
}

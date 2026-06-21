package practice_work;

public class Teacher extends Person {
	String sub;
	int salary;
	Department de;
	Teacher(String name,int age,String sub,int salary,Department de){
		super(name,age);
		this.sub=sub;
		this.salary=salary;
		this.de=de;
	}
	public void displayDetails() {
		System.out.println("TEACHERS DETAILS ARE:");
		System.out.println("the subject is:"+ sub);
		System.out.println("The salary is:" + salary);
		de.displayDetails();

	}

}

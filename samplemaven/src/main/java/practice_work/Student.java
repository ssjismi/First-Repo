package practice_work;

public class Student extends Person {
    int roll;
    String grade;
	Student(String name,int age,String grade,int roll){
		super(name,age);
		this.grade=grade;
		this.roll=roll;
		
	}
	public void displayDetails() {
		System.out.println("Student details:");
		super.displayDetails();
		System.out.println("My roll no is:"+roll);
		System.out.println("My grade is:" + grade);
	}

}

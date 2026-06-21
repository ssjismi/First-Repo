package practice_work;

public class ClassRoom {

	public static void main(String[] args) {
		Department d1=new Department("Computer Science");
		Student s=new Student("Jismi",24,"A",13);
		Teacher t=new Teacher("Renu",45,"CS",25000,d1);
		s.displayDetails();
		t.displayDetails();
	}

}

package aggregation;

public class Department {
	String deptname;
	Employee emp_ref;
	public Department(String deptname, Employee emp_ref)
	{
		this.deptname=deptname;
		this.emp_ref=emp_ref;
	}
	public void show()
	{
		System.out.println("Name is"+emp_ref.name+emp_ref.age+emp_ref.address+deptname);
	}

	public static void main(String[] args) {
		Employee e1=new Employee("jismi",24,"Golden valley");
		Department d1=new Department("CS Dept",e1);
		d1.show();
		
	}

}

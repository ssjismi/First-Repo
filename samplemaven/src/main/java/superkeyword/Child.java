package superkeyword;

public class Child  extends SuperParent{

	String name = "child";
	Child()
	{
		super();
		System.out.println("child constructor");
	}
	void show()
	{
		System.out.println("child method");
	}
	void display()
	{
		System.out.println("child variable:" +name);
		System.out.println("Parent Variable:"+ super.name);
		show();
		super.show();
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.display();

	}

}

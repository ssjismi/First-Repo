package AccessModifiers;

public class Access {
	public void display1()
	{
		System.out.println("This is public");
	}
	private void display2() {
		System.out.println("This is private");
	}
	protected void display3()
	{
		System.out.println("Thi is protected");
	}
	void display4()
	{
		System.out.println("Thi is default");
	}
//	public void showResult() {
//		
//	}
	public static void main(String args[])
	{
		Access ob1=new Access();
		ob1.display1();
		ob1.display2();
		ob1.display3();
		ob1.display4();
	}

}

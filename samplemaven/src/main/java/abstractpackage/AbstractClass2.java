package abstractpackage;

public class AbstractClass2 extends AbstractClass1{

	public static void main(String[] args) {
		AbstractClass2 ob=new AbstractClass2();
		ob.show();
		ob.childmethod();
		ob.display();
		
	}

	@Override
	public void show() {
		System.out.println("output from show method");
		
	}
	public void childmethod() {
		System.out.println("Hi");
	}

}

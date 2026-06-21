package interfacepackage;

public class Interface2 implements Interface1{

	public void show() {
		System.out.println("show");
	}
	
	public static void main(String[] args) {
		Interface2 ob=new Interface2();
		ob.display();
		ob.print();
		ob.show();
		//reference creation
		Interface1 obj1=new Interface2();
		obj1.display();
		obj1.print();

	}

	@Override
	public void display() {
		System.out.println("Display");
		
	}

	@Override
	public void print() {
		System.out.println("Print");
		
	}

}

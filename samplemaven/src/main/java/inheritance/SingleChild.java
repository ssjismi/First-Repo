package inheritance;

public class SingleChild extends SingleParent {

	public static void main(String[] args) {
		System.out.println(static_name);
		SingleChild ob1=new SingleChild();
		System.out.println(ob1.name);
		ob1.display();

	}

}

package inheritance;

public class MultilevelChild extends MultilevelParent{

	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		MultilevelChild oj1=new MultilevelChild();
		System.out.println(oj1.add(5, 6));
		oj1.show();
		oj1.display();
	}

}

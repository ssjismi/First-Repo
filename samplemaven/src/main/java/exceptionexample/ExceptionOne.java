package exceptionexample;

public class ExceptionOne {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException d) {  // if we do not know the exact exception just give it as Exception -- catch(Exception d)
			b=5;
			int c=a/b;
			System.out.println(c);
			System.out.println(d);
		}
		finally{
			
			System.out.println("operation completed");
		}

	}

}

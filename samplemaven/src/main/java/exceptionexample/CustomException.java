package exceptionexample;

public class CustomException {

	public static void main(String[] args) {
		int a=12;
		if(a>=18) {
			System.out.println("eligible to vote");
		}
		else 
		{
			throw new ArithmeticException("not eligible as age is under 18");
		}

	}

}

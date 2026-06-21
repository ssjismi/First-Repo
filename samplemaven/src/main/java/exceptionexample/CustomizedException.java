package exceptionexample;

public class CustomizedException {

	public static void main(String[] args) throws VoteEligibilityException {
		int a=12;
		if(a>=18) {
			System.out.println("eligible to vote");
		}
		else 
		{
			throw new VoteEligibilityException("not eligible as age is under 18");
		}

	}

}
//because of a new keyword inside the customised exception class - we have to invoke
//the constructor of the same class
//we can invoke a constructor only inside another constructor - super()
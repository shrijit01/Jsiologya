package corejava;
import java.util.*;

public class voting {
	public static void validateAge(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("You are not eligible for Voting!!!!");
		}
		else if (age<=55) {
			System.out.println("You are good to go");
			
		}
		else {
			System.out.println("Your age is over");
		}
	}


	public static void main(String[] args) {
		System.out.println("Enter your age here");
		Scanner sc = new Scanner (System.in);
		// TODO Auto-generated method stub
		try {
			voting.validateAge(sc.nextInt());
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
	System.out.println(e);
		}
	}

}

class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
		

	}

}

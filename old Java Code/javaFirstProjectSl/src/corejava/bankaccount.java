package corejava;
import java.util.*;

 class bank{
	 static void newaccount() {
		 int accountnumber;
		 double balance;
		 
	 }
	 static void deposit() {
		 
	 }
	 static void withdraw() {
		 
	 }
 }

public class bankaccount {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		
		bank bb = new bank();
		while (true) {
            System.out.println("Bank Application");
            System.out.println("1. Open new account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch (choice) {
            case 1:
            	System.out.println("Enter your account number");
            	int accountnumber = sc.nextInt();
            	
            
            }
            
            
		
		}
		}
		
	
	}




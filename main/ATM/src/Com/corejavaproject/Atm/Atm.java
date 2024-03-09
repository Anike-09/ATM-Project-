package Com.corejavaproject.Atm;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		int Withdraw , Balance = 50000;
		System.out.println("                      Welcome to 09 Atm      ");
		
		System.out.println();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Your Pin");
		
		int Pin = sc.nextInt();
		
		if(Pin == 5191) {
			System.out.println("Pin is Correct");
			}else {
				System.out.println("Pin is Incorrect");
				 System.exit(0);
			}
		 
	
	
	int n = 4 ;
	for(int i=1; i<=n ;i++) {
		System.out.println("");
		System.out.println("             1. Cash Deposite    "
				+ "  2. Cash Withdraw");
		System.out.println("");
		System.out.println("");
		System.out.println("             3. Mini Statement  "
				+ "   4.Cash Inquary ");
		System.out.println("");
		System.out.println("Enter Choice");
		
		int Choice = sc.nextInt();
		switch  (Choice) {
		case 1:
			System.out.println("Enter Amount for Deposite");
			 Withdraw = sc.nextInt();
			
			if(Balance >= Withdraw) {
				Balance = Balance - Withdraw ;
				System.out.println("Collect your Cash " + Withdraw);
				
			}else {
				System.out.println("Insufficient Balance");
			}
			break;
		case 2 :
			System.out.println("Enter your cash for Withdraw");
			int Deposite = sc.nextInt();
			
			Balance = Balance + Deposite ;
			System.out.println(Deposite + " is deposite to your account ");
			break;
		case 3:
			
			System.out.println("          Mini Statement");
			System.out.println(" Name           = Aniket Harugade");
			System.out.println(" Account number = ********009 ");
			System.out.println(" Mobile number  = 9307185191 ");
			System.out.println(" Email id       = *******@gmail.com");
		case 4:
			System.out.println("Total Balance = "+ Balance);
		}
		
	}
	System.out.println("");
	System.out.println("....................Thank You....................");
	System.out.println("                    Visit again");
	}

}

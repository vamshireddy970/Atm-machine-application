package atm;

import java.util.Scanner;

public class UserInterface {
	private static int status;
	public static void main(String[] args) {
		AtmOperationImpl impl=new AtmOperationImpl();
		Scanner scan=new Scanner(System.in);
		int atmnumber=123456;
		int atmpin=123;
		System.out.println("Enter the ATM Number");
		int atmnum2=scan.nextInt();
		System.out.println("Enter the ATM pin");
		int atmpin2=scan.nextInt();
		if(atmnumber==atmnum2 && atmpin==atmpin2) {
			while(true) {
			System.out.println(" 1.viewBalance\n 2.withdrawAmount\n 3.DepositAmount\n 4.viewMinistatement\n 5.exit");
			System.out.println("Enter the choice");
			int ch=scan.nextInt();
			if(ch==1) {
				impl.viewBalance();
			}
			else if(ch==2) {
				System.out.println("Enter the amount to withdraw");
				double withdrawAmount=scan.nextDouble();
				impl.withdrawAmount(withdrawAmount);
			}
			else if(ch==3) {
				System.out.println("Enter the amount to deposite");
				double depositAmount=scan.nextDouble();
				impl.depositAmount(depositAmount);
			}
			else if(ch==4) {
				impl.viewMiniStatement();
			}
			else if(ch==5) {
				System.out.println("Collect the Card ...");
				System.exit(status);
			}
			}
			
		}else {
			System.out.println("Enter the Credentials correctly");
		}
	}
}

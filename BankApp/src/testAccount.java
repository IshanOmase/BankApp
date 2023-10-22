package BankAccount;
import java.util.*;

public class testAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account[] acc = new Account[3];
		
		Scanner sc = new Scanner(System.in);
		
		int n, a, x=2, acno;
		String nm, em, nEm;
		double b, amt;
		boolean flag;
		do {
			System.out.println();
			System.out.println("0. To exit.");
			System.out.println("1. To enter an account.");
			System.out.println("2. To withdraw.");
			System.out.println("3. To deposit.");
			System.out.println("4. To change your set email");
			System.out.println("5. To display account details.");
			n = sc.nextInt();
			switch(n) {
			case 1:
					for(int i = 0; i < acc.length; i++) {
						System.out.print("Enter a account number: ");
						a = sc.nextInt();
						sc.nextLine();
						System.out.print("Enter your holder's name: ");
						nm = sc.nextLine();
						System.out.print("Enter you email: ");
						em = sc.nextLine();
						System.out.print("Enter your balance: ");
						b = sc.nextDouble();
						acc[i] = new Account(a,nm,em,b);
						
						System.out.print("Enter 1. To create add accounts. 2. To stop adding new accounts.");
						x = sc.nextInt();
						if(x==2) {
							break;
						}
						if(i == acc.length-1 && x == 1) {
							System.out.println("You have reached the limit. Tell the admin to increase the limit.");
							break;
						}
					}
					break;
			case 2:
				System.out.print("Enter your bank account no: ");
				acno = sc.nextInt();
				System.out.print("Enter the amount to be withdrawn: ");
				amt = sc.nextDouble();
				for(int i = 0; i <= acc.length; i++ ) {
					if(acc[i].getAccNo() == acno) {
						flag = acc[i].withdraw(amt);
						if (flag == false) {
							System.out.println("Insufficient balance!");
						}
						System.out.println("Your current balance is: "+ acc[i].getBalance());
						break;
					}
				}
				break;
			case 3:
				System.out.print("Enter your bank account no: ");
				acno = sc.nextInt();
				System.out.print("Enter the amount to be deposited: ");
				amt = sc.nextDouble();
				for(int i = 0; i <= acc.length; i++ ) {
					if(acc[i].getAccNo() == acno) {
						acc[i].deposit(amt);
						System.out.println("Your current balance is: "+ acc[i].getBalance());
						break;
					}
				}
				break;	
			case 4:
				System.out.print("Enter your bank account no: ");
				acno = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter your new Electronic Mail: ");
				nEm = sc.nextLine();
				for(int i = 0; i <= acc.length; i++ ) {
					if(acc[i].getAccNo() == acno) {
						acc[i].changeEmail(nEm);
						break;
					}
				}
				break;
			case 5:
				System.out.print("Enter your bank account no: ");
				acno = sc.nextInt();
				for(int i = 0; i <= acc.length; i++ ) {
					if(acc[i].getAccNo() == acno) {
						acc[i].displayAcc();
						break;
					}
				}
				break;
			default:
				if(n==0) {
					System.out.println("Thanks for using our services! Please visit us again!");
					break;
				}
				System.out.println("Enter Valid Input.");
					
		}		
			   
			 
		}while(n!=0);
		
		sc.close();
	}

}
